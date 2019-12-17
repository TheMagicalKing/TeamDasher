package UI.sample.appControllers;

import Logic.Pokemon;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.sql.SQLException;

public class MainMenuController {

    //Search button
    @FXML
    public Button searchNameButton = new Button();
    @FXML
    public Button searchTypeButton = new Button();
    @FXML
    public TextField searchTypeTextField = new TextField();
    @FXML
    public TextField searchNameTextField = new TextField();

    //Drop Down Menu
    @FXML
    public MenuButton searchParameterDropDown = new MenuButton();
    @FXML
    public MenuItem dropDownItem1 = new MenuItem();
    @FXML
    public MenuItem dropDownItem2 = new MenuItem();
    @FXML
    public HBox hBoxType = new HBox();
    @FXML
    public HBox hBoxName = new HBox();

    public void item1On(ActionEvent searchNameEvent) throws SQLException {
        hBoxType.setVisible(false);
        hBoxName.setVisible(true);
        searchParameterDropDown.setText("Search Parameter: Name");
    }

    public void item2On(ActionEvent searchTypeEvent) throws SQLException {
        hBoxType.setVisible(true);
        hBoxName.setVisible(false);
        searchParameterDropDown.setText("Search Parameter: Type");
    }

    public void searchNameAction(ActionEvent searchEvent) throws SQLException {

        ObservableList<Pokemon> searchList = Pokemon.searchDasherDexName(searchNameTextField.getText());

        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        typeColumn.setCellValueFactory(new PropertyValueFactory<>("type"));

        dasherDexTable.setItems(searchList);
    }
    public void searchTypeAction(ActionEvent searchEvent) throws SQLException {

        ObservableList<Pokemon> searchList = Pokemon.searchDasherDexType(searchTypeTextField.getText());

        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        typeColumn.setCellValueFactory(new PropertyValueFactory<>("type"));

        dasherDexTable.setItems(searchList);
    }

    //Edit button
    public Button editButton = new Button();

    public void editAction(ActionEvent editEvent) throws IOException {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../resources/EditMenu.fxml"));
            Parent editMenuParent = (Parent) fxmlLoader.load();
            Stage editStage = new Stage();
            editStage.initModality(Modality.APPLICATION_MODAL);
            editStage.initStyle(StageStyle.UTILITY);
            editStage.setTitle("Edit Menu");
            editStage.setScene(new Scene(editMenuParent));
            editStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Add button
    public Button addButton = new Button();

    public void addAction(ActionEvent addEvent) throws IOException {
        try {
            ComboBox comboSelect = new ComboBox();
            comboSelect.getItems().add("NORMAL");
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../resources/AddMenu.fxml"));
            Parent addMenuParent = (Parent) fxmlLoader.load();
            Stage addStage = new Stage();
            addStage.initModality(Modality.APPLICATION_MODAL);
            addStage.initStyle(StageStyle.UTILITY);
            addStage.setTitle("Add Menu");
            addStage.setScene(new Scene(addMenuParent));
            addStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Delete button
    public Button deleteButton = new Button();

    public void deleteAction(ActionEvent deleteEvent) throws IOException {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../resources/deleteWarning.fxml"));
            Parent deleteParent = (Parent) fxmlLoader.load();
            Stage deleteStage = new Stage();
            deleteStage.initModality(Modality.APPLICATION_MODAL);
            deleteStage.initStyle(StageStyle.UTILITY);
            deleteStage.setTitle("Confirm Deletion");
            deleteStage.setScene(new Scene(deleteParent));
            deleteStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //TableView
    @FXML
    TableView<Pokemon> dasherDexTable;
    @FXML
    TableColumn<Object, Object> nameColumn;
    @FXML
    TableColumn<Object, Object> typeColumn;

    //Update button
    @FXML
    Button updateTableButton = new Button();

    public void updateTableButtonAction(ActionEvent updateTableEvent) throws SQLException {
        ObservableList<Pokemon> list = Pokemon.initializeDasherDex();

        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        typeColumn.setCellValueFactory(new PropertyValueFactory<>("type"));

        dasherDexTable.setItems(list);
    }
}