# Shaype Webhook Notification
The Shaype platform sends webhook notifications for various events. This service is designed to receive and process those notifications.

Shaype offers three different types of notifications: `/email`, `/sms`, and `/event`. If you are using only B2B APIs, you will receive all notifications under the `/event` endpoint.

## In this sample application

* We have implemented only the `/event` endpoint. The other two endpoints will always return a 200 (recommended) response by default.
* It is a skeleton with implementations for the `CUSTOMER_STATUS_UPDATED` and `ACCOUNT_STATUS_CHANGE` events. To add more events to process, please follow the steps below:

1. Add the configuration in the `EventNotificationConfig` class.
2. Create and implement the event processor class by implementing the `EventNotificationProcessor` interface, e.g., `AccountStatusChangeEventProcessor`.


## Override /email and /sms endpoint behaviour (Optional)
* Implement `notifyEmail` and `notifySMS`  default method of `ApiApi` interface in `NotificationController` class 


## How to Run?
* Build the service with `$ gradle clean build`
* Run the application by `$ gradle bootrun`
 




