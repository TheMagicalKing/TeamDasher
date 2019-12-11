package sample.appControllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class MainMenuController {

    public MenuItem menuItem1 = new MenuItem();

    public void item1On(ActionEvent itemEvent1) throws IOException {
        menuItem1.setText("Element");
    }

    public MenuItem menuItem2 = new MenuItem();

    public void item2On(ActionEvent itemEvent2) throws IOException {
        menuItem2.setText("Evolution");
    }

    public MenuItem menuItem3 = new MenuItem();

    public void item3On(ActionEvent itemEvent3) throws IOException {
        menuItem3.setText("Weakness");
    }

    public Button searchButton = new Button();

    public void searchAction(ActionEvent searchEvent) throws IOException {

    }

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

    public Button addButton = new Button();

    public void addAction(ActionEvent addEvent) throws IOException {
        try {
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
}