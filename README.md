# Back End Portafolio Application2
***
## 1. :notebook_with_decorative_cover: General Info
This project is a dynamic website that contains all the relevant profesional information about me, like my laboral experience, the technologies I know, etc and the possibility to edit this information, if you are logged in. Check the Front End repository [here](https://github.com/JulianMeneses1/Portafolio-FrontEnd-AP)!

Status: ACTIVE :heavy_check_mark:

## 2. :gear: Technologies/Dependencies
***
Here are the technologies and libraries used in this project:
### Technologies
* [Java SE Development Kit](https://www.java.com/es/): Version 17.0.6
* [Spring Boot](https://spring.io/projects/spring-boot): Version 3.0.5
* [MySQL](https://www.mysql.com/): Version 8.0.33
### Dependencies
* Spring Data JPA
* Spring Web
* Spring Security
* Spring Boot DevTools
* Lombok
* MySQL Driver
* Spring Starter Validation
* Spring Webmvc-ui
## 3. :hammer_and_wrench: Installation
***
The IDE I used for this proyect is [Apache NetBeans 17](https://netbeans.apache.org/), but you can use another if you want.

In order to run this project you need to have Java and MySQL installed in your system, for that go to the respective pages, [Mysql](https://dev.mysql.com/downloads/mysql/) and [Java](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html), download the installer and follow the instructions. After that you have to open this proyect in your IDE and configure the connection to your database as well as other parameters. Use this example as a guide: 
```
# storage configuration
spring.servlet.multipar.max-file-size=3MB
media.location=imagenes

# database configuration
spring.jpa.hibernate.ddl-auto=update
spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect

# database connection
spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name?useSSL=false&serverTimezone=UTC
spring.datasource.username=your_username
spring.datasource.password=your_password

# mail delivery configuration

spring.mail.host=smtp.gmail.com
spring.mail.port=587
spring.mail.password= your_application_password
spring.mail.username= your_email
spring.mail.properties.mail.stmp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true
spring.mail.properties.mail.smtp.ssl.trust=smtp.gmail.com
spring.main.allow-circular-references=true
```
Great, all the configuration is set up, now you can run the server. :warning: Remember to have the database already created in MySQL, otherwise you will not be able to run the server. To create the database you can use MySQL Workbench or another administrator as phpMyAdmin.

## 4. :information_source: API Documentation Swagger
***
Check the full documentation of the API in this [link](https://portafolio-backend-ap-production.up.railway.app/swagger-ui/index.html)

## 5. :wave: Collaboration
***
Feel free to make any suggestion that you think can help improve the quality of the project! :grinning:




