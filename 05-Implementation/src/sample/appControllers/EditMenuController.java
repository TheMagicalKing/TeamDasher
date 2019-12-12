package sample.appControllers;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class EditMenuController {
    public Button editedButton = new Button();

    public void editedButtonAction(ActionEvent addButtonEvent) throws IOException {
        Stage stage = (Stage) editedButton.getScene().getWindow();
        stage.close();
    }
}
