# **BPMN Diagram for Secure Processing**

![BPMN Secure Process](/images/BPMN-swimlane-iulian.jpg)

## Purpose:

The BPMN diagram above presents the secure workflow of processing user authentication, data collection and transfer, and also error handling and logging in the Cloud, while generating alerts.

## Process Overview and Flows:
The process starts when a new user is created and afterwards being autheticated within the app his data form sensors are sent as an encrypted data package. The data is encrypted on the fly and at rest. Both user, authentication management and data controller are securely logging events that are evaluated if they represent errors. Afterwards these events and errors are stored for auditing purposes.

## Components:

1. User Management Swimlane 
Start Event: A user initiates a request to create, update, or delete a user.
Tasks in this Sequence are:

createUser, updateUser, or deleteUser (UserController): Process user-related actions.
Authentication Check (AuthManager): Calls verifyToken to ensure the user is authorized.

Data Encryption (DataEncryptor): Encrypts sensitive data if required before storage.

Store Data (DataController and CloudFirestore): Saves or updates the user data in the CloudFirestore.

Log Audit Event (AuditLogger): Logs actions as events (e.g., user created, updated, or deleted).

End Event: User management action is completed..

3. Authentication Swimlane
Start Event: User initiates login or token refresh.
Tasks in Sequence:

Authenticate (AuthManager): Authenticates user credentials using FirebaseAuth.

Generate/Refresh Token (AuthManager): Issues a new token or refreshes the token.

Log Event (AuditLogger): Records authentication activity (successful login, logout).

End Event: Authentication completes with either a successful login or logout.


5. Data Handling Swimlanes involves data encryption and data controlling
Start Event: Request to retrieve, save, or update data.
Tasks in Sequence:

Data Operation (DataController): Initiates either retrieval, save, or update.

Encrypt/Decrypt Data (DataEncryptor): Encrypts data before saving or decrypts data upon retrieval.

Data Storage/Retrieval (CloudFirestore): Stores or retrieves data from the database.

Log Data Event (AuditLogger): Logs data actions (e.g., data saved or retrieved).

End Event: Data operation is complete.

7. Error Handling and Logging Swimlanes
Start Event: An event is recorded, identified or not as an error, in any of the three main process categories above.
Tasks in Sequence:

Handle Error (ErrorHandler): Process the event, evaluates an error, categorizing and formatting it.

Log Error (CloudLogging): Log error details for tracking.

End Event: Error handling and logging are completed.
