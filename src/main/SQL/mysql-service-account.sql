CREATE DATABASE QA1;



CREATE USER 'cuzer'@'localhost' IDENTIFIED BY 'cingiz';
GRANT select on QA1.* to 'cuzer'@'localhost';
GRANT insert on QA1.* to 'cuzer'@'localhost';
GRANT update on QA1.* to 'cuzer'@'localhost';
GRANT delete on QA1.* to 'cuzer'@'localhost';

CREATE USER 'cuzer'@'%' IDENTIFIED BY 'cingiz';
GRANT select on QA1.* to 'cuzer'@'%';
GRANT insert on QA1.* to 'cuzer'@'%';
GRANT update on QA1.* to 'cuzer'@'%';
GRANT delete on QA1.* to 'cuzer'@'%';

FLUSH PRIVILEGES;