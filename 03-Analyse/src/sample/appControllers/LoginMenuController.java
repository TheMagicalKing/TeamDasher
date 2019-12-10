package sample.appControllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginMenuController {
    public Button loginButton = null; //Write this to work with the controls made in scene builder
    public Label waitForLogin = null;

    public void onAction(ActionEvent actionEvent) throws IOException {
        System.out.println("Button was clicked");
        waitForLogin.setText("Logging in!");

        //Changing to menu scene
        Parent menuParent = FXMLLoader.load(getClass().getResource("../resources/MainMenu.fxml"));
        Scene menuScene = new Scene(menuParent); //Creating new scene for the menu

        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

        window.setScene(menuScene);
        window.show();
    }
}
