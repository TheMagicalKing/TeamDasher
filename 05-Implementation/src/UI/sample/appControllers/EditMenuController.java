package UI.sample.appControllers;

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
    public ComboBox comboselect = new ComboBox();

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
            int typeNumber = 1;

            Object selectedItem = comboselect.selectionModelProperty().getValue();
            TextField s = comboselect.getEditor();

            validate();

        }

}
