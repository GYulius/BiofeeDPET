# **BPMN Diagram for Smartwatch Data Processing**

![BPMN Server](/images/BPMN_TremorDetection_image.png)

## Purpose:

This BPMN diagram depicts the workflow involved in processing data collected from a smartwatch, generating alerts, and managing user interactions. It outlines the steps for reading sensor values, packaging data, analyzing it, and responding based on the feedback loop with the phone.

## Process Overview:
The process starts when the smartwatch reads values from its sensors and creates a data package. This package is sent to a phone, which analyzes the data and sends back feedback. The smartwatch waits to receive the alert from the phone and notifies the user accordingly. The feedback is assessed to determine the next steps.

## Components:

1. Swimlane ("Smartwatch"): Represents the main participant in the process, indicating that all activities are performed by the smartwatch.

2. Start Event ("Read the values from the sensors"): Marks the beginning of the process when the smartwatch begins reading data from its sensors.

3. Task ("Creating the Data Package"): Represents the activity where the smartwatch prepares the data package to be sent.

4. Task ("Sending the Package to the Phone"): The action of transmitting the data package to the connected phone.

5. Task ("Receiving the Alert from Phone"): Indicates the smartwatch receiving feedback or alerts from the phone.

6. Task ("Alert the User"): Represents sending a notification to the user if necessary alerts are received.

7. Task ("Analyzing the Data received"): The process where the phone analyzes the incoming data package.

8. Task ("Constructing a Feedback"): Preparing a response based on the analysis of the data.

9. Task ("Sending the Feedback to the Smartwatch"): The action of transmitting the feedback back to the smartwatch.

10. Exclusive Gateway ("If Feedback is bad"): A decision point to determine the next steps based on the feedback received.

11. End Event: Marks the completion of the cycle where the process may loop back to continue monitoring and processing data.

## Flow Description:  

1. The process starts when the smartwatch reads the values from the sensors.
2. It then creates the data package to organize the collected information.
3. The data package is sent to the connected phone for analysis.
4. Upon receiving the package, the phone analyzes the data and constructs feedback based on the results.
5. The feedback is sent back to the smartwatch, which subsequently receives the alert and alerts the user if necessary.
6. The feedback is evaluated through the Exclusive Gateway to check if it is satisfactory.
7. If the feedback is deemed bad, further actions can be triggered; otherwise, the process may loop back to continue monitoring or receive new data.