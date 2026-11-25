/*
THIS IS HELLOAPP_LAUNCHER CLASS CODE; THIS EXAMPLE ILLUSTRATES HOW YOU CAN LINK THE PRE-BUILT LOGIN COMPONENT TO YOUR OWN APP BY MEANS OF A LAUNCHER  

COMPILATION:
javac --module-path path_to_your_javafx_sdk_lib_folder --add-modules javafx.controls,javafx.graphics,javafx.fxml HelloApp_Launcher.java

EXECUTION:
java --module-path path_to_your_javafx_sdk_lib_folder --add-modules javafx.controls,javafx.graphics,javafx.fxml --enable-native-access=javafx.graphics -cp ./loginapp.jar:./helloapp.jar HelloApp.java

**IMPORTANT**: HelloApp_Launcher.java, loginapp.jar and helloapp.jar must be placed in the same directory; otherwise modify class-path properly

SEE COMMENTS INCLUDED IN HELLOAPP MAIN CLASS CODE ON HOW TO ADAPT YOUR APP CODE

*/

import loginapp.*; // import all loginapp package classes
import helloapp.*; // import all helloapp package classes
import javafx.application.*;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.fxml.*;
import javafx.beans.property.*;
import java.io.File;
import java.lang.Exception;

public class HelloApp_Launcher extends Application {

@Override
public void start(Stage stage) throws Exception {

Login logger = new Login();
try {logger.login();} catch(Exception e) {e.printStackTrace(System.out);}

Login.isValidated.addListener((obs,oldValue,newValue) -> {

if (newValue) {

Login.login_stage.close();

HelloApp my_app = new HelloApp();
try {my_app.hello_app();} catch(Exception e) {e.printStackTrace(System.out);}
 
  }


});

   }

public static void main(String[] args) {

launch();

}

   }
