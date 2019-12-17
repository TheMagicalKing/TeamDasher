package UI.sample.appControllers;

import Logic.DasherDexCon;
import Logic.Pokemon;
import Logic.Type;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
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


    public void addComboItem(ActionEvent typeSelect){
        //comboSelect.getItems().addAll("Normal","Water");
    }

    DasherDexCon addPokemon = new DasherDexCon();

    public void addedButtonAction(ActionEvent addButtonEvent) throws IOException, SQLException {
        int typeNumber = 0;




        Object selectedItem = comboSelect.selectionModelProperty().getValue();
        TextField s = comboSelect.getEditor();

        System.out.println(selectedItem);
        System.out.println(s);
       /*switch(""+selectedItem+"") {
            case "NORMAL":
                typeNumber = 1;
                System.out.println(typeNumber);
                break;
        }
       boolean x = false;

            if (x == true){
            System.out.println(selectedItem);
            System.out.println(typeNumber);
            addPokemon.DasherDexCon(addNameField.getText(),typeNumber);
            Stage stage = (Stage) addedButton.getScene().getWindow();
            stage.close();}*/



    }
}
