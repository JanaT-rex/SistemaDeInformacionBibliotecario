CREATE DATABASE biblioteca
USE biblioteca;

CREATE TABLE actividadprestamo (
  id_APrestamo int AUTO_INCREMENT NOT NULL PRIMARY KEY,
  id_prestamo int,
  FOREIGN KEY (id_prestamo) REFERENCES prestamos (id_prestamo)
);
CREATE TABLE actividaddevolucion (
  id_ADevolucion int NOT NULL AUTO_INCREMENT NOT NULL PRIMARY KEY,
  id_prestamo int,
  FOREIGN KEY (id_prestamo) REFERENCES prestamos (id_prestamo)
);


CREATE TABLE lectores (
  id_lector int AUTO_INCREMENT NOT NULL PRIMARY KEY,
  nombre varchar(50),
  apellido varchar(50),
  grado varchar(50),
  grupo varchar(50),
  turno varchar(50),
  asignacion varchar(50)
);

CREATE TABLE libros (
  id_lib int AUTO_INCREMENT NOT NULL PRIMARY KEY,
  titulo varchar(50),
  autor varchar(50),
  editorial varchar(50),
  categoria varchar(50),
  cantidad int,
  ejemplares int
);

CREATE TABLE prestamos (
  id_prestamo int AUTO_INCREMENT NOT NULL PRIMARY KEY,
  id_lector int,
  id_lib int,
  fecha_prestamo date,
  fecha_devolucion date,
  FOREIGN KEY (id_lector) REFERENCES lectores (id_lector),
  FOREIGN KEY (id_lib) REFERENCES libros (id_lib)
);

CREATE TABLE usuarios (
  id_usu int AUTO_INCREMENT NOT NULL PRIMARY KEY,
  nombre_usu varchar(50),
  contraseña varchar(50) DEFAULT NULL,
  turno varchar(50) DEFAULT NULL
);





