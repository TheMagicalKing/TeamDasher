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

public class CreateLoginController {
    public Button confirmAccountCreationButton = null;
    public Label waitForInputCreateLogin = null;

    public void confirmAccountCreationButtonAction(ActionEvent confirmAccountCreationEvent) throws IOException {
        waitForInputCreateLogin.setText("Creating Login!");

        //Changing to login scene
        Parent menuParent = FXMLLoader.load(getClass().getResource("../resources/LoginMenu.fxml"));
        Scene loginScene = new Scene(menuParent); //Creating new scene for the login menu

        Stage createLoginWindow = (Stage) ((Node) confirmAccountCreationEvent.getSource()).getScene().getWindow();

        createLoginWindow.setScene(loginScene);
        createLoginWindow.show();
    }
}
