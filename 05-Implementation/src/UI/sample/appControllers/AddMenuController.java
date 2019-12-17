package UI.sample.appControllers;

import Logic.DasherDexCon;
import Logic.Pokemon;
import Logic.Type;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ComboBoxBase;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.SelectionModel;


import javax.swing.*;
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
        TextField s = comboSelect.getEditor();

        System.out.println(selectedItem);
        System.out.println(s);
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
       boolean x = false;

        validate();
        System.out.println(selectedItem);
        System.out.println(typeNumber);



    }
}
