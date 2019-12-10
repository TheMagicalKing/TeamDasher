package sample.appControllers;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;

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
    public void searchButton(ActionEvent searchEvent) throws IOException {
        // TODO: 10-12-2019 add search function
    }
    public Button editButton = new Button();
    public void editButton(ActionEvent editEvent) throws IOException {
    }
    public Button addButton = new Button();
    public void AddButton(ActionEvent addEvent) throws IOException {
    }
}