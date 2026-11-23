//import org.junit.Test;
//import static org.junit.Assert.assertTrue;
//import static org.junit.Assert.assertEquals;
import loginapp.*;
import javafx.application.*;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.fxml.*;
import javafx.beans.property.*;
import java.io.File;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class JavaFX_Button extends Application {

public Button button;

@Override
    public void start(Stage stage) throws Exception {
        button = new Button("click me!");
        button.setOnAction(actionEvent -> button.setText("clicked!"));
        stage.setScene(new Scene(new StackPane(button), 100, 100));
        stage.show();
   } 



public static void main(String[] args) {
//JavaFX_Button button_app = new JavaFX_Button();
launch();
}

 }
