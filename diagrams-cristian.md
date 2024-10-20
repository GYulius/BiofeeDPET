# **Server Class Diagram**

![Class Diagram](/images/Server_Class_Diagram.png)

The server contains four classes:

1. Server
2. User
3. Data
4. Smartwatch

## Server Class

This class contains the information about the server, the IP and the Port on which the Phone App connects. In contains the all of the registered users and it also contains the Data which is getting from the smartwatch. The server process the data and sets the feedback, which it will be sent back to the phone.

## User Class

This class has all the needed information about the user of this Phone App. It has the name, username, password and the age of the user. The age which will be used for the data process for the feedback.

## Data Class

This class contains all of the Smartwatch sensors: the heart rate, the accelerometer and the rotation rate. This class is mainly used for processing it and to send back the feedback.

## Smartwatch Class

This class contains all of the Smartwatch information: the brand, the model and the software version of the smartwatch. This information is also needed to know how accurate the sensors are.


# **Smartwatch Class Diagram**

![Class Diagram](/images/Smartwatch_Class_Diagram.png)

## Data Class

This class contains all of the Smartwatch sensors: the heart rate, the accelerometer and the rotation rate. This class is mainly used for processing it and to send back the feedback.

## Smartwatch Class

This class contains all of the Smartwatch information: the brand, the model and the software version of the smartwatch. This information is also needed to know how accurate the sensors are.



# **Sequence Diagram**

![Sequence Diagram](/images/Sequence_Diagram.png)

As the project, the diagram contains four objects:

1. Smartwatch
2. User
3. Cloud Platform
4. Server

The steps are the User from the Phone App logins to the server. All the security and securing the data are part of the Cloud Platform.
All the data collected from the sensors of the smartwatch are put in a package which is sent to the Phone App, sent to Cloud, to be secured and in the last getting to the server to be processed.
After the processing of the data is done the feedback is written and sent out back to the phone app.
In the case that the feedback is a bad one(for example the tremor starts) the phone app sends to the smartwatch a signal that triggers an alert on the watch.
This process continues until the User disconnects the app from the server.
