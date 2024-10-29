# **Server Class Diagram**

![Class Diagram](/images/Server_Class_Diagram.png)

The server contains eleven classes:

1. Server
2. User
3. Data
4. Smartwatch
5. Observer
6. TremorDetector
7. Subject
8. Database
9. State
10. Normal State
11. TremorDetectedState

## Server Class

This class contains the information about the server, the IP and the Port on which the Phone App connects. In contains the all of the registered users and it also contains the Data which is getting from the smartwatch. The server process the data and sets the feedback, which it will be sent back to the phone.

## User Class

This class has all the needed information about the user of this Phone App. It has the name, username, password and the age of the user. The age which will be used for the data process for the feedback.

## Data Class

This class contains all of the Smartwatch sensors: the heart rate, the accelerometer and the rotation rate. This class is mainly used for processing it and to send back the feedback.

## Smartwatch Class

This class contains all of the Smartwatch information: the brand, the model and the software version of the smartwatch. This information is also needed to know how accurate the sensors are.

## Observer, Subject and TremorDetector Classes

This classes are part of the Observer Pattern.
The class Subject being an interface class with TremorDetector being the inherited class.
TremorDetector class can have 1 or objects of type Observer which help to detect if a Tremor will start.

## Database Class

Database class is a singleton class which is taking care of the SQL database.

## State, NormalState and TremorDetectedState Classes

Class State is an interface based on which we have NormalState and TremorDetectedState.
These 3 classes compose the State Design Pattern.
Using the Observe design pattern we can change the state if we are in a tremor state or in a normal state. 


# **Smartwatch Class Diagram**

![Class Diagram](/images/Smartwatch_Class_Diagram.png)

The smartwatch contains seven classes:

1. Data
2. Smartwatch
3. Command
4. TurnOffAlert
5. TurnOnAlert
6. Feedback
7. SmartwatchFactory

## Data Class

This class contains all of the Smartwatch sensors: the heart rate, the accelerometer and the rotation rate. This class is mainly used for processing it and to send back the feedback.

## Smartwatch Class

This class contains all of the Smartwatch information: the brand, the model and the software version of the smartwatch. This information is also needed to know how accurate the sensors are.
This class also is part of the Command Design Pattern. It is the Invoker.

## Command, TurnOffAlert, TurnOnAlert and Feedback Classes

The Command class is the base interface for the Command Design Pattern, also the interface for TurnOffAlert and TurnOnAlert.
The classes TurnOffAlert and TurnOnAlert are used for setting an alert on the smartwatch in case that the Tremor is too high.
The Feedback Class is the one coming from the phone app to turn on or off the alerts.

## SmartwatchFactory

This Class is part of Factory Design Pattern.
It is taking care of creating the Data classes which after will be sent to the server to be analyzed.


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
