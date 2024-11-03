# **BPMN Diagram for Tremor Detection and Logging Process**

![BPMN Server](/images/BPMN_Server_Image.png)

## Purpose:

This BPMN diagram models the process of receiving data from the smartwatch, analyzing the data for tremors, determining user existence, logging the event, and storing it in the database. It provides a clear visualization of the workflow involved in tremor detection and data management.


## Process Overview:

The process begins when the server receives a data package from the smartwatch. The system analyzes the incoming data to check for tremor detection. If a tremor is detected, the system checks whether the user exists in the database; if the user does not exist, it creates a new user and logs the detection event. If a user already exists, the data is logged directly with a timestamp.

## Components:

- Swimlane ("Server"): Represents the main participant in this process, indicating that all activities occur within the server.

- Start Event ("Getting the Data Package"): Marks the beginning of the process when the data package is received.

- Task ("Analyze Data"): Represents the activity of processing the received data to identify if a tremor has occurred.

- Task ("Query the Database"): The activity where the system checks if the user exists in the database.

- Exclusive Gateway ("if tremor is detected"): A decision point that determines the next course of action based on the analysis of the data.

- Task ("Starting to log the Data from the User"): Represents the action of preparing to log the tremor data.

- Task ("Log the Data with the Timestamp and Store it to Database"): The task involved in logging the detected tremor alongside a timestamp for historical tracking.

- End Event: This serves as a final step marking the completion of the tremor detection and logging process.

## Flow Description

1. The process starts with the Start Event labeled "Getting the Data Package", which indicates that the server has received a new data package.
2. The system then performs the Task "Analyze Data" to determine if the incoming signal indicates a tremor.
3. After analysis, the Exclusive Gateway checks “if tremor is detected.”
    - If a tremor is detected:
        - The system then performs the Task "Starting to log the Data from the User."
        - It queries the user information in the Task "Query the Database."
        - Another Exclusive Gateway checks “If User exists.”
            - If the user does not exist:
                - The system performs the Task "Create the User and then Store it."
            - If the user does exist:
                - It logs the tremor data directly.
4. Finally, the system executes the Task "Log the Data with the Timestamp and Store it to Database", finalizing the logging procedure.