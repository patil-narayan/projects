CREATE TABLE attribute (
ID INT NOT NULL AUTO_INCREMENT,
NAME VARCHAR(50) DEFAULT NULL,
Description VARCHAR(255) DEFAULT NULL,
CREATED_ON TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
PRIMARY KEY (ID)
);

ALTER TABLE bulk_template ADD COLUMN TYPE VARCHAR(50) DEFAULT NULL;
UPDATE bulk_template SET TYPE = 'SMS';