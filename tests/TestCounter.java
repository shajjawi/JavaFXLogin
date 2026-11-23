
//import static org.junit.jupiter.api.Assertions.*; //import forjunit5
//import org.junit.jupiter.api.Test; // import for junit5

/*
Example compilation using junit5:
$JDK_25/javac -cp .:../JUnit/junit4.10/junit-platform-console-standalone-1.7.2.jar:../login.jar --module-path $FX_25 \
--add-modules javafx.controls,javafx.swing,javafx.graphics,javafx.fxml TestCounter.java

Example exectuion using junit5:
$JDK_25/java --module-path $FX_25 --add-modules javafx.graphics,javafx.controls,javafx.swing,javafx.fxml --enable-native-access=javafx.graphics \
-jar ../JUnit/junit4.10/junit-platform-console-standalone-1.7.2.jar -cp .:../login.jar --select-class TestCounter

*/

import org.junit.Test; // import for junit4
import static org.junit.Assert.*; // import for junit4

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

import javafx.application.*;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.fxml.*;
import javafx.beans.property.*;
import java.io.File;
import javafx.embed.swing.JFXPanel;
import javafx.scene.layout.*;

public class TestCounter {


@Test
public void testmysql() {
Mysql mysql = new Mysql();
mysql.validate_user("Georgi","Facello");
DB db = mysql.db;
assertTrue(mysql instanceof Mysql);
assertTrue(db instanceof DB);
}



    @Test
    public void testA() throws InterruptedException {
        Thread thread = new Thread(new Runnable() {

            @Override
            public void run() {
                new JFXPanel(); // Initializes the JavaFx Platform
                Platform.runLater(new Runnable() {

                    @Override
                    public void run() {
                    //try{new JavaFX_Button().start(new Stage());assertTrue(true);} catch(Exception e) {} 
                    JavaFX_Button javafx_button = new JavaFX_Button();
                    try{
                        javafx_button.start(new Stage());
                        assertEquals(javafx_button.button.getText(),"click me!");
                        javafx_button.button.fire();
                        assertEquals("Error en el test","clicked!",javafx_button.button.getText());
                         } catch(Exception e) {}; // Create and initialize your app

                    }
                });
            }
        });
        thread.start();// Initialize the thread
        Thread.sleep(10000); // Time to use the app, with out this, the thread will be killed before you can tell.
        //assertTrue(javafx_button.button instanceof Button);
    }

//public static void main(String[] args) {}

  } //end of class

