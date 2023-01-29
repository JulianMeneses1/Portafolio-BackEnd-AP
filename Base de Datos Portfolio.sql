create database ap_portfolio;
use ap_portfolio;

create table Personas (
Usuario varchar(50) PRIMARY KEY NOT NULL,
Contraseña varchar(50),
Email varchar(50) UNIQUE
);

create table Acerca_de_mi (
Acerca_de_mi_ID INT PRIMARY KEY NOT NULL auto_increment,
Titulo varchar(50),
Descripcion varchar(200)
);

create table Conocimientos (
Conocimiento_ID INT PRIMARY KEY NOT NULL auto_increment,
Titulo varchar(50),
Icono varchar(100)
);

create table Experiencia_laboral (
Experiencia_laboral_ID INT PRIMARY KEY NOT NULL auto_increment,
Titulo varchar(50),
Descripcion varchar(200)
);

create table Formacion_academica (
Formacion_academica_ID INT PRIMARY KEY NOT NULL auto_increment,
Titulo varchar(50),
Descripcion varchar(200)
);

create table Proyectos (
Proyecto_ID INT PRIMARY KEY NOT NULL auto_increment,
Titulo varchar(50),
Descripcion varchar(200),
Imagen varchar(100)
);

create table Banner (
Banner_ID INT PRIMARY KEY NOT NULL auto_increment,
Titulo varchar(50),
Subtitulo varchar(100),
Imagen_banner varchar(100),
Imagen_perfil varchar(100)
)