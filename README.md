# Overview
JavaFXLogin - a graphic user interface Java + JavaFX precompiled software component for MySQL user loggin.

This non-modular component is intended for developers, offering simple and fast integration with any JavaFX desktop application project requiring basic graphical user login interface (app_user_name + app_user_password) against local MySQL Server.

It also offers an interface for db administrators, allowing to configure database access parameters (db_user, db_password, db_name, db_table, db_table_user_field, db_table_password_field).

Integration with your own JavaFX application project is carried out in a very simple way by means of an instance of the main class Login object and further checking of the login process result (see example of use).

# Dependencies

JavaFXLogin package classes and its dependencies have been compiled under jdk-27.0.1.0.3 and javafx-sdk-27 in Ubuntu/Mint environment. It requires JRE v11 and accordingly JavaFX library components for compilation and execution, platform independent MySQL jdbc driver connector (mysql-connector-j-9.4.0.jar included in the lib sub-folder) and MySQL Server locally installed.

# Usage

Add the import loginapp.Login to your Main or Launcher class code and the javafxlogin.jar path to your class-path. 

You can see example code of integration with another JavaFX application by clicking here. 
