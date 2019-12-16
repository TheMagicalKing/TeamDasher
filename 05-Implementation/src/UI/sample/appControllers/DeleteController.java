package UI.sample.appControllers;

import Logic.DasherDexCon;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class DeleteController {
    public Button confirmDeleteButton = new Button();
    DasherDexCon deletePokemon = new DasherDexCon();

    public void confirmDeleteButtonAction(ActionEvent addButtonEvent) throws IOException {
        Stage stage = (Stage) confirmDeleteButton.getScene().getWindow();

        stage.close();
    }
    public Button regretDeleteButton = new Button();

    public void regretDeleteButtonAction(ActionEvent addButtonEvent) throws IOException {
        Stage stage = (Stage) regretDeleteButton.getScene().getWindow();
        stage.close();
    }
}
