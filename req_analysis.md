# Requirement Analysis
# BiofeeDPET

**Problem Recognition**

Essential Tremor (_ET_) as stand-alone disorder or part of Parkinson's Disorder (PD) has no medical treatment, and patients suffering from ET were so far subjects for new drugs testing aiming to improve their condition but none proved to be the cure.
	The aim of this app is not to solve the medical issue and cure the disease or to be recognized as a treatment for these disorders, but to help individuals with this condition to help themselves to a a better quality of life.
	This app will add value to smartwatches and wearables in general, beneficial to their owners, bringing an increased quality to existing health apps pool.
	_BiofeeDPET_ will line up after various research projects making use of their results and testing new ways to approach this issue. 
 
**Expectation of user**

Users with PD and/or ET will want through this app to control the levels of the tremor they constantly experience to improve their overall condition.
	All users will expect the app will provide a _calibration_ method for the tremor at start. 
	Users can expect to use this app also to _connect to emergency system_ in place, especially if the mobile plan is activated.
	All actors involved need this app to _be secure_ as it handles sensitive personal information associated to the health status.
        The app will point out these rising levels triggered by certain distress situations and bring those levels to user's attention as data flow from _accelerometer and gyroscope sensors_ of the smartwatch.
        User's awareness will be accomplished by means of messages notified with a buzz, a vocal message and specific red (for high level) – yellow (for medium level) – green (for low level)  background colors on a smartwatch.
	The users being constantly aware through the monitoring color, in order to bring the color from red to green, will be able to opt for :
	- handling a specific situation by focusing on muscle relaxation to try themselves to bring this specific high level of tremor level from high to low by being attentive  
	- make use of sounds played on their smartwatch and/or smartphone to help them induce a more relaxed status, and those sounds can be either a specific frequency, or relaxation music clips.
 
**Evaluation and Synthesis**

BiofeeDPET may bring a difference mostly in the early stages of this disorder, and is a path worth taken to find out more about the human brain not yet known abilities.
	The functions of this app must include: 
        - calibration on current lowest values of the accelerometer and gyroscope sensors readings;
        - read data from accelerometer and gyroscope sensors;
        - send data from the accelerometer and gyroscope sensors of the smartwach to the smartphone that is already paired with the smartwatch, and placed within the required range for BT communication;
        - send data from heart monitoring/pulse sensor of the smartwach to the smartphone;
        - send and receive data to and from a server hosted as a virtual machine on a cloud platform, as GCP;
        - process the three data flows on the server;
        - receive the processed data, induce different UI;
        - check if a LTE network and mobile plan are set on the smartwatch;
        - listen to and execute voice commands (of most importance if the smartwatch benefits from LTE technology);
        - receive and play audio files;
        - pass security checks on encrypted data in-flight and at rest, in cache and stored in the database or backups
        
**The constraints by design** are the following:

The system interface setup for the interaction of the components of the app with the system and with each other must respect component-driven development principles.
	The UI/UX should be designed as targeting not only the elderly people.
 	The various brands and manufacturers of smartwatches limitations on the market were observed: 
  	- Huawei as first option both for the lasting battery and lower cost will be included in a later stage of development because of the limited access to it's sensors data if the developer is registered as an individual (which is the case) and not enterprise;
   	- Garmin has a smaller segment on the market and one must develop using Monkey C and Connect IQ SDK after this manufacturer dropped Java and other options;
    	- Xiaomi has less history comparing to other brands, so less documentation, and even getting to developer mode was difficult not much a while ago;
     	- low-budget brands as Amazfit invite to use also budget tools as Zepp Studio for their Zepp OS or the same, and the quality of the sensors might not be the best;
      	- Samsung with it's history of running Wear OS on various models seemed the best option to start the development using Android Studio even one has to charge the watch 3 to 7 times more often than Huawei models.


**Modeling - use cases and diagrams**

Taking in consideration the information above, the following functional and behavioral models are chosen by the project team: 
	- the functional model as structured representation of the functions (activities, actions, processes, operations) will be represented as functional flow block diagram.
 	- the behavioral model will present the set of all signals compatible with the system and will align to the principles presented in the following paper:  _On interconnections, control, and feedback_ by J.C. Willems, IEEE Transactions on Automatic Control Volume 42, pages 326-339, 1997 [http://homes.esat.kuleuven.be/~jwillems/Articles/JournalArticles/1997.4.pdf](url)
	The above models are based on Data flow modeling DFM conceptual model presented in the data flow diagram.
The project team made use of ChatGPT to present here below the AI-Generated use case.

Request to ChatGPT 4: create use case diagram for the following scenario: 
- install the app using the smartphone
- store personal data of the user and contact person for for this user using smartphone
- calibrate on current lowest values of the accelerometer and gyroscope smartwatch sensors readings;
- read data from accelerometer and gyroscope sensors;
- send data from the accelerometer and gyroscope sensors of the smartwach to the smartphone that is already paired with the smartwatch, and placed within the required range for BT communication;
- send data from heart monitoring/pulse sensor of the smartwach to the smartphone;
- send and receive data to and from a server hosted as a virtual machine on a cloud platform;
- process the three data flows on the server;
- receive the processed data, induce different UI;
- check if a LTE network and mobile plan are set on the smartwatch so the fall emergency call function can be used;
- listen to and execute voice commands (of most importance if the smartwatch benefits from LTE technology);
receive and play audio files;
- app must secure and encrypt data flows: on-the-fly, in cache and stored in the database

  AI Generated use case:

The use case diagram for this scenario can involve several actors (Smartphone User, Smartwatch User, Server, and possibly a Cloud Platform) and their interactions with different system components and functions. Below is a description of how the diagram should look, followed by the explanation for each use case.

Actors:
Smartphone User
Smartwatch User
Cloud Platform
Server
Use Cases:
Install App (Smartphone User): The user installs the app on the smartphone.
Store Personal and Contact Data (Smartphone User): The user inputs personal and emergency contact data via the smartphone.
Calibrate Sensors (Smartwatch User): The smartwatch user calibrates accelerometer and gyroscope sensors on the smartwatch.
Read Sensors Data (Smartwatch): The smartwatch reads data from the accelerometer, gyroscope, and heart rate sensors.
Send Sensor Data to Smartphone (Smartwatch): Data from the smartwatch is sent to the paired smartphone (via Bluetooth).
Send/Receive Data to/from Server (Smartphone): Data is sent to the cloud-based server and processed data is received back from the server.
Process Sensor Data (Server): The server processes the data sent from the smartwatch via the smartphone.
Induce Different UI (Smartphone): The smartphone updates its UI based on the processed data received from the server.
Check LTE Availability for Emergency Call (Smartwatch): The smartwatch checks if LTE network and a mobile plan are available for emergency call.
Execute Voice Commands (Smartwatch): The smartwatch listens to and executes voice commands.
Receive and Play Audio Files (Smartwatch): The smartwatch receives and plays audio files from the server or smartphone.
Secure Data Flows (System): Data flows are encrypted and secured at all stages: on-the-fly, in cache, and in storage (in the database).

System:
Smartphone
Smartwatch
Cloud Server

Use Case Diagram Description:
Actors:
Smartphone User: Initiates the installation, stores personal and contact information, and interacts with the app for receiving processed data and updating UI.
Smartwatch User: Interacts with the smartwatch by calibrating sensors, checking LTE availability, and giving voice commands.
Cloud Platform: Hosts the virtual server for data processing.
Server: Processes the sensor data, handles secure communication, and sends processed data back to the smartphone.
System Interactions:
Smartwatch: Reads sensor data (accelerometer, gyroscope, and heart rate), checks LTE, and communicates with the smartphone.
Smartphone: Receives sensor data, stores user data, sends/receives data to/from the cloud-based server, and updates UI.
Server: Receives raw sensor data, processes it, and sends the results back to the smartphone for further interaction with the user.
I’ll now create a visual representation of this use case diagram.

! [use case AI-Generated diagram] ([use_case_diagram_AI_generated.jpg](url))

Here is the use case diagram illustrating the interactions between the Smartphone User, Smartwatch User, Server, and Cloud Platform with the various system functionalities. The diagram highlights the major use cases, including installing the app, storing personal data, reading sensor data, sending data to the smartphone, processing data on the server, updating the UI, handling emergency LTE availability, executing voice commands, playing audio files, and securing data flows. Each actor has corresponding interactions with different use cases relevant to their role.

  
 
**Specification** 

The following software requirement specification (SRS) must be observed: 
 
**Review**

How can BiofeeDPET be improved, on which details should further more work and development be allocated and how the overall quality of this app can be increased:
