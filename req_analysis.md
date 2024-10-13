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
        - pass security checks on encrypted data flows: on-the-fly, in cache and stored in the database
        
**The constraints by design** are the following:

	-
	The system interface setup for the interaction of the components of the app with the system and with each other:
	The UI/UX should be designed as targeting not only elderly people.


**Modeling**

	Taking in consideration the information above, the following functional and behavioral models are chosen by the project team: 
	The above models are based on this conceptual model:
 
**Specification** 

	The following software requirement specification (SRS) must be observed: 
 
**Review**

	How can BiofeeDPET be improved, on which details should further more work and development be allocated and how the overall quality of this app can be increased:
