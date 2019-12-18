package UI.appControllers;

import Logic.DasherDexCon;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

public class    EditMenuController {

    //Edit button action
    public Button editedButton = new Button();
    public TextField NameField = new TextField();
    public ComboBox TypeSelect = new ComboBox();

    public int typeNumber = 1;
    MainMenuController mainMenuControl = new MainMenuController();

    public boolean validate() throws SQLException {
        StringBuilder errors = new StringBuilder();
        if (NameField.getText().isEmpty()) {
            errors.append("-Please enter a name");
        }
        if (errors.length() > 0) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Warning");
            alert.setHeaderText("Required Fields Empty");
            alert.setContentText(errors.toString());

            alert.showAndWait();
            return false;
        }

        DasherDexCon specifyPokemon = new DasherDexCon();
        System.out.println(mainMenuControl.getSelectionModel());

        specifyPokemon.DasherDexCon(NameField.getText(),typeNumber,mainMenuControl.getSelectionModel());

        Stage stage = (Stage) editedButton.getScene().getWindow();
        stage.close();
        return true;
    }

    public void editedButtonAction(ActionEvent editedButtonEvent) throws IOException, SQLException {

        String selectedItem = (String) TypeSelect.getValue();
            TextField s = TypeSelect.getEditor();

        switch(""+selectedItem+"") {
            case "Normal":
                typeNumber = 1;
                System.out.println(typeNumber);
                break;
            case "WATER":
                typeNumber = 2;
                System.out.println(typeNumber);
                break;
            case "GROUND":
                typeNumber = 3;
                System.out.println(typeNumber);
                break;
            case "ELECTRIC":
                typeNumber = 4;
                System.out.println(typeNumber);
                break;
            case "GRASS":
                typeNumber = 5;
                System.out.println(typeNumber);
                break;
            case "FLYING":
                typeNumber = 6;
                System.out.println(typeNumber);
                break;
            case "POISON":
                typeNumber = 7;
                System.out.println(typeNumber);
                break;
            case "FIGHTING":
                typeNumber = 8;
                System.out.println(typeNumber);
                break;
            case "ROCK":
                typeNumber = 9;
                System.out.println(typeNumber);
                break;
            case "BUG":
                typeNumber = 10;
                System.out.println(typeNumber);
                break;
            case "GHOST":
                typeNumber = 11;
                System.out.println(typeNumber);
                break;
            case "FIRE":
                typeNumber = 12;
                System.out.println(typeNumber);
                break;
            case "ICE":
                typeNumber = 13;
                System.out.println(typeNumber);
                break;
            case "PSYCHIC":
                typeNumber = 14;
                System.out.println(typeNumber);
                break;
            case "DRAGON":
                typeNumber = 15;
                System.out.println(typeNumber);
                break;
        }
            validate();

        }

}
