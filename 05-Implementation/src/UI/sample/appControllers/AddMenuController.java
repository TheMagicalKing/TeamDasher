package UI.sample.appControllers;

import Logic.DasherDexCon;
import Logic.Pokemon;
import Logic.Type;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.stage.Stage;


import java.io.IOException;
import java.sql.SQLException;

public class AddMenuController {


    //Add Pokemon action
    public Button addedButton = new Button();
    public TextField addNameField = new TextField();
    public ComboBox comboSelect = new ComboBox();
    public int typeNumber;
    public boolean validate() throws SQLException {
        StringBuilder errors = new StringBuilder();
        if (addNameField.getText().isEmpty()) {
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
        DasherDexCon addPokemon = new DasherDexCon();
        addPokemon.DasherDexCon(addNameField.getText(),typeNumber);
        Stage stage = (Stage) addedButton.getScene().getWindow();
        stage.close();
    return true;
    }


    public void addComboItem(ActionEvent typeSelect){
        comboSelect.getItems().addAll("Normal","Water");
            }


    public void addedButtonAction(ActionEvent addButtonEvent) throws IOException, SQLException {
        int typeNumber = 0;
        Type types = Type.BLANK;
        String selectedItem = String.valueOf(comboSelect.getSelectionModel().getSelectedItem());



        /*switch(comboSelect.getValue().toString()) {
            case "NORMAL":
                typeNumber = 1;
                System.out.println(typeNumber);
                break;
        } */
        validate();
        System.out.println(selectedItem);
        System.out.println(typeNumber);


    }
}
