package UI.sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    //Starting the application
    @Override
    public void init() throws Exception {
        System.out.println("Application initializing!");
        //TODO lav en klasse med metoden forneden
        //Logic.Pokemon.initializeDasherDex();
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("resources/MainMenu.fxml"));
        primaryStage.setTitle("DasherDex");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
