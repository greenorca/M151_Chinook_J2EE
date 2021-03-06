# M151 Chinook J2EE

This is an extensible J2EE-Webproject to demonstrate the cooperation of servlets, JSP and JDBC within an Apache Tomcat and MySQL Application.

The project is based on a web tutorial: [http://o7planning.org/en/10285/create-a-simple-java-web-application-using-servlet-jsp-and-jdbc](http://o7planning.org/en/10285/create-a-simple-java-web-application-using-servlet-jsp-and-jdbc). Instead of the database used in O7Planning tutorial, the Chinook database [https://github.com/lerocha/chinook-database](https://github.com/lerocha/chinook-database) is used.

![Chinook-ERD](docs/images/chinook_erd.png)

The documentation is based on an Debian OS with pre-installed BITNAMI lamp stack and the Eclipse Neon J2EE IDE. If you are using something else, feel free to fiddle around :-)

This git-project can be directly imported into Eclipse.

## Setup DB (Mysql on Debian)

### Install the database

Import the database file (`DB_Config/Chinook.sql`) with the tool of your choice. Please setup a user account for the Chinook-DB, e.g.

```mysql
CREATE USER 'demo'@'localhost' IDENTIFIED BY 'demo';
GRANT ALL ON Chinook.* TO 'demo'@'localhost';
FLUSH PRIVILEGES;
```
 

### Reset Mysql root password (in case you lost it)

```bash
cd lampstack..
./use_lamstack
mysqld --skip-grant-tables
```

```mysql
//login mysql client without credentials: mysql
FLUSH PRIVILEGES;
SET PASSWORD FOR 'root'@'localhost' = PASSWORD('***');
FLUSH PRIVILEGES;
exit
```

```bash
ps aux | grep mysql
kill *6600*
```

## Install Apache Tomcat

### Make sure Webtools-Plugin is installed:
![Webtools in Eclipse installieren](docs/images/eclipse_wtp_install.png)

### Install and configure Tomcat Application Server (7.0) 
![Tomcat installieren](docs/images/tomcat_install1.png)

![Tomcat Runtime konfigurieren](docs/images/tomcat_project_config.png)

### Install JDBC (on Debian / Ubuntu) if needed

sudo apt-get install libmysql-java

link /usr/share/java/mysql-connector-java.jar via Drag'n Drop in WebContent/WEB-INF/lib