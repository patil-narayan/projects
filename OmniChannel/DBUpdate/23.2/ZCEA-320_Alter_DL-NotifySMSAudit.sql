ALTER TABLE distribution_list ADD COLUMN TYPE VARCHAR(50) DEFAULT NULL;
ALTER TABLE NOTIFY_SMS_AUDIT ADD STATUS VARCHAR(50) DEFAULT NULL AFTER template;
ALTER TABLE NOTIFY_SMS_AUDIT ADD REASON VARCHAR(255) DEFAULT NULL AFTER STATUS;

UPDATE distribution_list SET TYPE = 'SMS';