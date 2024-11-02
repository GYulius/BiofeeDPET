# Diagrams

Iulian Gherghevici


The AI Generated use case diagram included


![Use case](/images/use_case_diagram_AI_generated.jpg)


The class diagram

Again, made use of ChatGPT 4 to obtain an AI-Generated suggestion regarding the class diagram, as presented here below:

For the given scenario, the class diagram will model the key components and their relationships for the application. These components will include classes for the Smartphone, Smartwatch, Sensor, User, Server, Data, and other important functionalities.

Key Classes and Attributes:
SmartphoneApp

Attributes:
appID: String
userData: User
contactData: Contact
Methods:
installApp(): void
storePersonalData(): void
receiveSensorData(data: SensorData): void
sendDataToServer(data: ProcessedData): void
updateUI(): void
Smartwatch

Attributes:
watchID: String
sensors: List<Sensor>
isLTEAvailable: Boolean
Methods:
calibrateSensors(): void
readSensorData(): SensorData
sendDataToPhone(data: SensorData): void
checkLTE(): Boolean
executeVoiceCommand(command: String): void
playAudio(audioFile: AudioFile): void
User

Attributes:
userID: String
name: String
age: int
healthData: HealthData
Methods:
setPersonalData(): void
getHealthData(): HealthData
Contact

Attributes:
contactID: String
name: String
relationship: String
phoneNumber: String
Sensor

Attributes:
sensorID: String
sensorType: String
currentReading: float
Methods:
calibrate(): void
readData(): float
HeartRateSensor (extends Sensor)

Attributes:
heartRate: float
Methods:
readHeartRate(): float
Accelerometer (extends Sensor)

Attributes:
acceleration: float
Methods:
readAcceleration(): float
Gyroscope (extends Sensor)

Attributes:
rotationRate: float
Methods:
readRotationRate(): float
SensorData

Attributes:
sensorID: String
timestamp: Date
value: float
ProcessedData

Attributes:
dataID: String
processedValues: Dictionary<String, float>
Methods:
processSensorData(sensorData: SensorData): ProcessedData
Server

Attributes:
serverID: String
isAvailable: Boolean
Methods:
processData(data: SensorData): ProcessedData
sendProcessedDataToPhone(data: ProcessedData): void
secureDataFlow(data: Data): void
CloudPlatform

Attributes:
platformID: String
hostingServer: Server
Methods:
sendDataToServer(data: Data): void
receiveDataFromServer(): ProcessedData
AudioFile

Attributes:
fileID: String
filePath: String
duration: float

Relationships:
SmartphoneApp interacts with Smartwatch and Server to receive sensor data, send it to the server, and update the user interface.
Smartwatch contains multiple Sensor objects, such as HeartRateSensor, Accelerometer, and Gyroscope. It also checks LTE availability and handles voice commands and audio playback.
User is associated with personal HealthData and Contact information.
SensorData is collected by sensors on the smartwatch, then sent to the SmartphoneApp and Server for processing.
Server processes SensorData and sends the results (in the form of ProcessedData) back to the SmartphoneApp.
CloudPlatform is responsible for hosting the Server and enabling data flow between devices and the server.
Class Diagram:
I will now create a visual representation of this class diagram:


![Classes](/images/class_diagram_AI_iulian.jpg)

-------------- End of AI-Generated suggestion ---------------

Else, to design a secure mobile app meant speciffically to be hosted on Google Cloud Platform (GCP), here below is an outline of the classes and key components, along with the high-level architecture and cloud interactions. This app will use secure data exchange practices with GCP, ensuring that user data is encrypted, authenticated, and securely managed throughout.

# 1. Key Classes and Components related to GCP
For secure data exchange, here are the primary classes and interactions between the mobile app, backend server, and Google Cloud services:

## Mobile App Classes
AuthManager

Responsible for managing user authentication and access tokens.
Interacts with GCP Identity and Access Management (IAM) or Firebase Authentication.

DataEncryptor

Handles local encryption of sensitive data before transmission.
Uses industry-standard encryption libraries to secure data.

ApiClient

Manages secure RESTful API requests between the mobile app and the backend server.
Integrates with SSL/TLS for transport-layer security.
Handles automatic refresh of tokens and retries for resilience.

ErrorHandler

Monitors for errors, logs securely, and handles retries for network calls.
Ensures proper error handling with relevant user feedback.

## Backend Server Classes
UserController

Validates user requests and manages CRUD operations related to user accounts.
Works with AuthManager on the backend to authenticate requests.

DataController

Handles requests for data storage, retrieval, and updates.
Uses Cloud Firestore, Cloud SQL, or Cloud Storage to securely store user data.

AuthManager (Backend)

Verifies access tokens and refreshes them as needed.
Manages OAuth tokens, JWT tokens, and Firebase Auth integrations.

DataEncryptor (Backend)

Decrypts data received from the client and re-encrypts for storage in databases.
Ensures data at rest is secured using Google Cloud’s encryption.

AuditLogger

Logs critical events securely for audit purposes, including access and modifications.
Interacts with GCP’s Cloud Logging or Cloud Audit Logs.
GCP Services (Integration)

Firebase Authentication

Provides secure authentication and authorization for mobile users.
Manages session tokens and user credentials.

Cloud Firestore / Cloud SQL

Stores data with encryption at rest, using Google Cloud’s managed database solutions.
Provides access controls and database encryption features.

Cloud Key Management (KMS)

Manages cryptographic keys securely.
Provides secure data encryption keys (DEK) for encrypting sensitive data.

Cloud Functions / App Engine

Runs backend logic for the app with managed scalability.
Secures serverless functions or application code with Identity-Aware Proxy (IAP) and IAM.

Cloud Endpoints

Serves as the API gateway, managing security policies, rate limiting, and API monitoring.
Integrates with Google Cloud Armor for DDoS protection.

The methods associated to the classes above might be: 

### Mobile App Classes

AuthManager

authenticateUser(credentials: UserCredentials): Token
refreshToken(): Token
logout(): Boolean
DataEncryptor

encryptData(data: String): String
decryptData(data: String): String

ApiClient

sendRequest(url: String, data: String): ApiResponse
receiveResponse(): ApiResponse

ErrorHandler

handleError(error: Error): Void
logError(error: Error): Void
Backend Server Classes

UserController

createUser(user: User): Boolean
updateUser(userId: String, user: User): Boolean
deleteUser(userId: String): Boolean

DataController

saveData(data: Data): Boolean
getData(dataId: String): Data
updateData(dataId: String, data: Data): Boolean

AuthManagerBackend

verifyToken(token: String): Boolean
generateToken(user: User): Token

DataEncryptorBackend

encryptForStorage(data: String): String
decryptForRetrieval(data: String): String

AuditLogger

logEvent(event: String): Void
auditAction(action: String): Void
GCP Services (Simulated)

FirebaseAuth

authenticate(user: UserCredentials): Token
validateToken(token: String): Boolean

CloudFirestore

storeData(data: Data): Boolean
retrieveData(dataId: String): Data

CloudKMS

manageKeys(): Key
encrypt(data: String): String
decrypt(data: String): String

CloudLogging

logError(error: Error): Void
logAuditTrail(auditInfo: String): Void

![Classes](/images/class_diagram_iulian2.png)

# 2. Use Case Diagram related to GCP
The following use cases should be illustrated for the mobile app’s interactions with the GCP-hosted backend:

User Authentication:

Mobile app authenticates with Firebase Auth, receives JWT or OAuth tokens.

Data Exchange:

User initiates data read/write from the app, which is securely transmitted to the backend.

Data Encryption:

Mobile app encrypts data locally before sending.
Backend decrypts, processes, and re-encrypts data as needed.

Error Logging and Auditing:

Critical errors are logged, and sensitive actions are monitored for audit purposes.

Token Refresh:

App handles token refresh requests for continued access.

![Use Case GCP](/images/Use_Case_Diagram_iulian.png)



# The functional flow block diagram FFBD

Here below the suggestion given by ChatGPT 4:

A functional flow block diagram (FFBD) visually represents the functional flow of a system, breaking down processes step by step. For the given application scenario, we'll create a flow diagram focusing on the major functions and how data flows between them, including interaction between the Smartphone, Smartwatch, Server, and Cloud Platform.

Key Functional Blocks
Install App
The app is installed on the smartphone.

Store Personal Data
User enters and stores personal data, including health and contact information.

Calibrate Sensors
Smartwatch sensors (accelerometer, gyroscope) are calibrated to establish baseline readings.

Read Sensor Data
Sensors on the smartwatch gather data from accelerometer, gyroscope, and heart rate sensor.

Send Data to Smartphone
Sensor data is sent from the smartwatch to the paired smartphone.

Send/Receive Data to/from Server
The smartphone sends raw sensor data to the cloud server for processing, and receives processed data back.

Process Data on Server
The server processes the sensor data (acceleration, gyroscope, heart rate) to detect falls, trends, or anomalies.

Update UI on Smartphone
Based on the processed data, the smartphone app updates the UI to provide feedback to the user (e.g., alerts).

Check LTE & Emergency Call Capability
The smartwatch checks if LTE and mobile plan are available for emergency calls.

Execute Voice Commands
The smartwatch listens for and executes voice commands (e.g., trigger an action or report health status).

Receive and Play Audio
The smartwatch can receive and play audio files based on voice commands or notifications.

Encrypt and Secure Data
Secure all data flows (real-time, cached, and stored data).

Functional Flow Block Diagram Description
Block 1: Install App
→ Leads to Block 2: Store Personal Data on the smartphone.

Block 3: Calibrate Sensors
→ Initiates the calibration of smartwatch sensors, enabling further data collection.

Block 4: Read Sensor Data
→ Outputs the data that is passed to Block 5: Send Data to Smartphone.

Block 5: Send Data to Smartphone
→ Passes raw data to Block 6: Send/Receive Data to/from Server for cloud processing.

Block 6: Send/Receive Data to/from Server
→ Server processes the data via Block 7: Process Data on Server.

Block 7: Process Data on Server
→ Sends the processed data back to Block 6.

Block 8: Update UI on Smartphone
→ Shows the processed data and possible actions on the smartphone.

Block 9: Check LTE & Emergency Call Capability
→ Ensures that the smartwatch can make emergency calls if needed.

Block 10: Execute Voice Commands
→ Smartwatch listens for and performs actions based on voice commands.

Block 11: Receive and Play Audio
→ Plays audio files or notifications received via the smartphone.

Block 12: Encrypt and Secure Data
→ Continuously secures data at each stage, both during transmission and storage.

I will now create a visual representation of the functional flow block diagram.

It seems like I can’t do more advanced data analysis right now. Please try again later. However, I can still help you manually design the functional flow block diagram based on the description. Let me know if you'd like more guidance on that!

-------------- End of AI-Generated suggestion ---------------

As one can see above, ChatGPT 4 choked on generating the actual diagram, even offered a delay between repeated requests: first time trying to work on it, second time trying less time and the third time offered the same decline message immediately.

Below is presented the human-generated :) image of the FFBD:


![Functional flow](/images/functional_flow_block_iulian.jpg)


The data flow diagram

The same kind of suggestion was asked from ChatGPT and here below the reply:

To model a Data Flow Diagram (DFD) for the given scenario, we'll focus on the key data processes, data stores, external entities (user, smartwatch, smartphone, cloud platform, server), and data flows between them.

Key Components of the DFD:
External Entities:

User: Provides personal data and interacts with the system (via smartphone or smartwatch).
Smartwatch: Collects sensor data (accelerometer, gyroscope, heart rate) and interacts with the smartphone.
Cloud Platform/Server: Processes data and provides feedback to the smartphone.
Processes:

Install App: Installs the app on the smartphone.
Store Personal Data: Collects and stores the user's personal information and emergency contact data.
Calibrate Sensors: The smartwatch calibrates sensors based on current conditions.
Read Sensor Data: Smartwatch sensors collect accelerometer, gyroscope, and heart rate data.
Send Data to Smartphone: The smartwatch sends raw sensor data to the paired smartphone.
Send/Receive Data to/from Server: The smartphone sends data to the server for processing and receives results.
Process Data on Server: The server processes sensor data to detect events (e.g., fall detection) or trends.
Update UI on Smartphone: The smartphone app updates its user interface based on the processed data.
Check LTE & Emergency Call: Checks if the smartwatch is capable of making emergency calls.
Execute Voice Commands: Listens for and executes voice commands.
Receive and Play Audio: Plays audio feedback or notifications.
Encrypt and Secure Data: Secures all data during transmission and storage.
Data Stores:

User Data: Stores personal information and emergency contact.
Raw Sensor Data: Holds the raw data collected by smartwatch sensors.
Processed Data: Stores processed data received from the server.
Data Flows:

Personal Data Flow: User input (name, contact info, etc.) flows into the system for storage and emergency use.
Sensor Data Flow: Sensor data (accelerometer, gyroscope, heart rate) flows from the smartwatch to the smartphone.
Server Data Flow: Data flows from the smartphone to the server for processing and returns processed data back to the smartphone.
Voice Command Data Flow: User voice commands are processed and executed.

Data Flow Diagram Breakdown (Level 0 and Level 1)
Level 0 DFD (Context Diagram):
At the top level, the diagram will include:

User → SmartphoneApp → Cloud Server
Smartwatch → SmartphoneApp
Data flows between these main entities.
Level 1 DFD (Detailed Diagram):
This will include more granular processes, showing how data moves between the user, smartphone, smartwatch, cloud server, and data stores.

Suggested Level 0 DFD (Context Diagram):
User:

Input: Personal data, voice commands.
Output: Processed data display, audio feedback, alerts.
Smartwatch:

Input: Sensor data from accelerometer, gyroscope, heart rate sensor.
Output: Raw sensor data sent to smartphone.
SmartphoneApp (Central Process):

Inputs: Personal data, sensor data from smartwatch.
Outputs: Sends data to the server, updates UI, performs emergency checks, executes voice commands.
Server (Cloud Platform):

Input: Raw sensor data from the smartphone.
Output: Processed data sent back to the smartphone.

Level 1 DFD:
Here’s a more detailed breakdown of the processes:

Process 1: Install App:

Data Flow: User initiates installation of the app on the smartphone.
Process 2: Store Personal Data:

Input: Personal data entered by the user.
Output: Data stored in User Data Store.
Process 3: Calibrate Sensors:

Input: Calibration data collected by the smartwatch.
Output: Calibration stored on the smartwatch.
Process 4: Read Sensor Data:

Input: Sensor data from accelerometer, gyroscope, heart rate sensor.
Output: Raw data sent to SmartphoneApp.
Process 5: Send Data to Smartphone:

Input: Raw sensor data.
Output: Data transmitted to SmartphoneApp.
Process 6: Send/Receive Data to/from Server:

Input: Raw sensor data from the smartphone.
Output: Processed data sent back to SmartphoneApp.
Process 7: Process Data on Server:

Input: Raw sensor data.
Output: Processed data, including alerts and fall detection.
Process 8: Update UI on Smartphone:

Input: Processed data from the server.
Output: Updated UI, feedback displayed to user.
Process 9: Check LTE & Emergency Call:

Input: Device capabilities.
Output: Verification of emergency call function.
Process 10: Execute Voice Commands:

Input: User voice commands.
Output: Execution of relevant actions (e.g., make a call).
Process 11: Receive and Play Audio:

Input: Audio files or notifications.
Output: Audio played on the smartwatch.
Process 12: Encrypt and Secure Data:

Input: Any data being transmitted or stored.
Output: Secure and encrypted data across all processes.


Visual Diagram
I will now create a basic visual representation of the Level 0 and Level 1 Data Flow Diagram.

It seems like I can’t do more advanced data analysis right now. Please try again later. However, I can guide you on how to manually create the Data Flow Diagram or provide a detailed breakdown of the steps. Let me know how you'd like to proceed!

-------------- End of AI-Generated suggestion ---------------

Same as above, the AI-generated content stopped at bringing up the actual image of a DFD.

Below is Iulian's DFD image representation:


![Data flow](/images/data_flow_iulian.jpg)


