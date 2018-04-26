CREATE USER 'cuzer'@'localhost' IDENTIFIED BY 'cingiz';

GRANT select on cuzer.* to 'springframework'@'locahost';
GRANT insert on cuzer.* to 'springframework'@'locahost';
GRANT update on cuzer.* to 'springframework'@'locahost';
GRANT delete on cuzer.* to 'springframework'@'locahost';