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
        waitForLogin.setText("Logging in!");

        //Changing to menu scene
        Parent menuParent = FXMLLoader.load(getClass().getResource("../resources/MainMenu.fxml"));
        Scene menuScene = new Scene(menuParent);

        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

        window.setScene(menuScene);
        window.show();
    }
    public Button createAccountButton = null;

    public void createAccountButtonAction(ActionEvent createAccountEvent) throws IOException {

        //Changing to create login menu scene
        Parent menuParent = FXMLLoader.load(getClass().getResource("../resources/CreateLoginMenu.fxml"));
        Scene createLoginScene = new Scene(menuParent);

        Stage createLoginWindow = (Stage) ((Node) createAccountEvent.getSource()).getScene().getWindow();

        createLoginWindow.setScene(createLoginScene);
        createLoginWindow.show();
    }
}
