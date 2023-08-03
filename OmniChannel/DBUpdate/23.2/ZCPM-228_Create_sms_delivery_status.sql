CREATE TABLE sms_delivery_status (
ID int NOT NULL AUTO_INCREMENT,
MESSAGE_SID varchar(255) DEFAULT NULL,
MESSAGE_STATUS varchar(50) DEFAULT NULL,
SMS_STATUS varchar(50) DEFAULT NULL,
SMS_SID varchar(255) DEFAULT NULL,
TO_NUMBER varchar(15) DEFAULT NULL,
FROM_NUMBER varchar(15) DEFAULT NULL,
API_VERSION varchar(255) DEFAULT NULL,
ACCOUNT_SID varchar(255) DEFAULT NULL,
CREATED_ON timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
PRIMARY KEY (ID)
);