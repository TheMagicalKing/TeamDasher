package UI.sample.appControllers;

import Logic.DasherDexCon;
import Logic.Pokemon;
import Logic.Type;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

public class AddMenuController {

    //Add Pokemon action
    public Button addedButton = new Button();
    public TextField addNameField = new TextField();


    DasherDexCon addPokemon = new DasherDexCon();

    public void addedButtonAction(ActionEvent addButtonEvent) throws IOException, SQLException {
        int typeNumber = 0;

        Type types = Type.BLANK;
        switch(types) {
            case NORMAL:
                typeNumber= 1;
                break;
            case ELECTRIC:
                break;
        }
        addPokemon.DasherDexCon(addNameField.getText(),typeNumber);
        Stage stage = (Stage) addedButton.getScene().getWindow();
        stage.close();
    }
}
