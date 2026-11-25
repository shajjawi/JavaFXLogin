# Overview
loginapp is a Java + JavaFX precompiled packaged software component which offers graphical user login interface against MySQL database.

This non-modular component is intended for developers, offering simple and fast integration with any other JavaFX desktop application project requiring basic graphical user login interface (app_user_name + app_user_password) against local MySQL Server.

It also offers an interface for db administrators, allowing to configure database access parameters (db_user, db_password, db_name, db_table, db_table_user_field, db_table_password_field).

Integration with your own JavaFX application project is carried out in a very simple way by means of an instance of the main class Login object and further checking of the login process result (see example of use).

# Dependencies

loginapp package classes and its dependencies have been compiled under jdk-27.0.1.0.3 and javafx-sdk-27 in Ubuntu/Mint environment. It requires JRE v11 or higher and accordingly JavaFX library components for compilation and execution, platform independent MySQL jdbc driver connector (mysql-connector-j-9.4.0.jar included in the lib sub-folder) and MySQL Server locally installed.

# Usage

Download the file login.jar (available from [here](https://github.com/shajjawi/JavaFXLogin/blob/main/login.jar)), add it to your class-path or library and add the import loginapp.Login to your Main or Launcher class. 

You can view demo code of integration with the example HelloApp javafx application by clicking [here](https://github.com/shajjawi/JavaFXLogin/blob/main/HelloApp_Launcher.java). 

# Doc

Javadoc documentation for classes and methods under loginapp is available [here](https://github.com/shajjawi/JavaFXLogin/tree/main/doc)

# Unitary tests

javafxlogin package classes have been tested by using junit4.10 Click [here](https://github.com/shajjawi/JavaFXLogin/tree/main/tests) to downloand the tests folder.
