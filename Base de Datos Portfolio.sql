create database ap_portfolio;
use ap_portfolio;

create table Usuarios (
usuario varchar(50) PRIMARY KEY NOT NULL,
contraseña varchar(50)
);

create table Acerca_de_mi (
id INT PRIMARY KEY NOT NULL auto_increment,
titulo varchar(50),
descripcion varchar(200)
);

create table Conocimientos (
id INT PRIMARY KEY NOT NULL auto_increment,
titulo varchar(50),
icono varchar(100)
);

create table Experiencia_laboral (
id INT PRIMARY KEY NOT NULL auto_increment,
nombreEmpresa varchar(50),
descripcion varchar(200),
fechaInicio DATE,
fechaFin DATE
);

create table Formacion_academica (
id INT PRIMARY KEY NOT NULL auto_increment,
titulo varchar(50),
descripcion varchar(200)
);

create table Proyectos (
id INT PRIMARY KEY NOT NULL auto_increment,
titulo varchar(50),
descripcion varchar(200),
imagen varchar(100)
);

create table Banner (
id INT PRIMARY KEY NOT NULL auto_increment,
titulo varchar(50),
subtitulo varchar(100),
imagenBanner varchar(100),
imagenPerfil varchar(100)
);

create table Personas (
id INT PRIMARY KEY auto_increment,
nombre varchar(50),
apellido varchar(40),
email varchar(50) UNIQUE,
banner_id INT,
usuario varchar(50),
acerca_de_mi_id INT,
formacion_academica_id INT,
experiencia_laboral_id INT,
foreign key (banner_id) references Banner (id),
foreign key (usuario) references Usuarios (usuario),
foreign key (acerca_de_mi_id) references Acerca_de_mi (id),
foreign key (formacion_academica_id) references Formacion_academica (id),
foreign key (experiencia_laboral_id) references Experiencia_laboral (id)
);

create table Conocimientos_Personas (
id INT PRIMARY KEY auto_increment,
personas_id INT,
conocimientos_id INT,
foreign key (personas_id) references Personas (id),
foreign key (conocimientos_id) references Conocimientos(id)
)