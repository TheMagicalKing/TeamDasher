package sample.appControllers;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class AddMenuController {
    public Button addedButton = new Button();

    public void addedButtonAction(ActionEvent addButtonEvent) throws IOException {
        Stage stage = (Stage) addedButton.getScene().getWindow();
        stage.close();
    }
}
