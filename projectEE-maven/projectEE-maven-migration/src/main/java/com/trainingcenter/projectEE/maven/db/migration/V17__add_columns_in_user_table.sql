ALTER TABLE user ADD COLUMN login VARCHAR(255) AFTER id_user;
ALTER TABLE user ADD COLUMN password VARCHAR(255) AFTER login;

