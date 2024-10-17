CREATE DATABASE IF NOT EXISTS  proyectodemodb;
USE  proyectodemodb;

CREATE USER 'usuario'@'localhost' IDENTIFIED BY 'contraseña'; GRANT ALL
PRIVILEGES ON proyectodemodb.* TO 'usuario'@'localhost'; FLUSH PRIVILEGES;

