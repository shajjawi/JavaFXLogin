
/* junit5 imports */
//import static org.junit.jupiter.api.Assertions.*; 
//import org.junit.jupiter.api.Test;

/*
Example compilation using junit5:
$JDK_25/javac -cp .:../JUnit/junit4.10/junit-platform-console-standalone-1.7.2.jar:../login.jar --module-path $FX_25 \
--add-modules javafx.controls,javafx.swing,javafx.graphics,javafx.fxml TestCounter.java

Example exectuion using junit5:
$JDK_25/java --module-path $FX_25 --add-modules javafx.graphics,javafx.controls,javafx.swing,javafx.fxml --enable-native-access=javafx.graphics \
-jar ../JUnit/junit4.10/junit-platform-console-standalone-1.7.2.jar -cp .:../login.jar --select-class TestCounter

*/

/* junit4 imports */
import org.junit.Test; 
import static org.junit.Assert.*; 

/*
Example compilation using junit4:
$JDK_25/javac -cp .:../JUnit/junit4.10/junit-4.10.jar:../login.jar --module-path $FX_25 \ 
--add-modules javafx.controls,javafx.swing,javafx.graphics,javafx.fxml TestCounter.java

Example execution using junit5:
$JDK_25/java -cp .:../JUnit/junit4.10/junit-4.10.jar:../login.jar --module-path $FX_25 \
--add-modules javafx.controls,javafx.swing,javafx.graphics,javafx.fxml --enable-native-access=javafx.graphics org.junit.runner.JUnitCore TestCounter
*/

import loginapp.*;
import java.sql.*;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.File;

import javafx.application.*;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.fxml.*;
import javafx.beans.property.*;
import java.io.File;
import javafx.embed.swing.JFXPanel;
import javafx.scene.layout.*;



public class TestLogin {

String[] app_access_params = new String[] {"db_user","db_passwd","employees","employees","first_name","last_name"};
File file = new File("db_access_data.txt");

 
@Test // test for application db access parameters output file stream proper creation
public void test_DB_class() { 
DB db = new DB(app_access_params);
assertTrue(db instanceof DB);
assertTrue(file.exists());
 }

@Test // test for existing user
public void test_mysql_existing_user() { 
Mysql mysql = new Mysql();
assertTrue(mysql.validate_user("Georgi","Facello")); 
 }

@Test  // test for non existing user
public void test_mysql_non_existing_user() { 
Mysql mysql = new Mysql();
assertFalse(mysql.validate_user("Georg","Facell"));  
 }

@Test // test db access params dialog is the first stage to show if db_access_params.txt is not found
    public void testA() throws InterruptedException {
        Thread thread = new Thread(new Runnable() {

            @Override
            public void run() {
                new JFXPanel(); // Initializes the JavaFx Platform
                Platform.runLater(new Runnable() {

                    @Override
                    public void run() {
                    file.delete();
                    Login logger = new Login();
                    try {

                    logger.login();
                    assertTrue(logger.db_params_stage.isShowing());

                     } catch(Exception e) {};
             
                  }
                });
            }
        });

       thread.start();// Initialize the thread
       Thread.sleep(1000); // Time to use the app, with out this, the thread will be killed before you can tell.
    }

@Test // test user login dialog is the first stage to show if db_access_params.txt is found
    public void testB() throws InterruptedException {
        Thread thread = new Thread(new Runnable() {

            @Override
            public void run() {
                new JFXPanel(); // Initializes the JavaFx Platform
                Platform.runLater(new Runnable() {

                    @Override
                    public void run() {
                    DB db = new DB(app_access_params);
                    Login logger = new Login();
                    try {

                    logger.login();
                    assertTrue(logger.db_params_stage.isShowing());

                     } catch(Exception e) {};

                  }
                });
            }
        });

       thread.start();// Initialize the thread
       Thread.sleep(1000); // Time to use the app, with out this, the thread will be killed before you can tell.
    }



  } //end of class

