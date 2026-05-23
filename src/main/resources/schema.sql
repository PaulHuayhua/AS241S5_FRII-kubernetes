CREATE TABLE IF NOT EXISTS PERSONAS (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50) NOT NULL,
    email VARCHAR(50) NOT NULL
);

INSERT INTO PERSONAS (nombre, apellido, email)
VALUES ('Paul', 'Huayhua', 'paul.huayhua@vallegrande.edu.pe');

INSERT INTO PERSONAS (nombre, apellido, email)
VALUES ('example', 'example', 'example@gmail.com');
