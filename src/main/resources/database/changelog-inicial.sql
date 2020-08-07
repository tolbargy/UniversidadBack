-- liquibase formatted sql

-- changeset jorge:1
-- comment: Tabla necesaria para poder crear el maestro tatata
CREATE TABLE maestro (
    id INT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    descripcion TEXT NOT NULL
);