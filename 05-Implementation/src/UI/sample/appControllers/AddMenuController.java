package UI.sample.appControllers;

import Logic.Pokemon;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class AddMenuController {
    public Button addedButton = new Button();
    public TextField addNameField = new TextField();
    public TextField addTypeField = new TextField();
    public TextField addEvolutionField = new TextField();
    public TextField addWeaknessField = new TextField();

    Pokemon pi = new Pokemon();

    public void addedButtonAction(ActionEvent addButtonEvent) throws IOException {
        pi.addPokemon(addNameField.getText(), addTypeField.getText());
        Stage stage = (Stage) addedButton.getScene().getWindow();
        stage.close();
    }
}
