package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Working..");
        primaryStage.setScene(new Scene(root, 650, 600));
        primaryStage.show();
        primaryStage.setResizable(false);
    }

    @Override
    public void init() throws Exception {
        super.init();
        System.out.println("init blogu");

    }

    @Override
    public void stop() throws Exception {
        System.out.println("Stop blogu");
        super.stop();
    }

    public static void main(String[] args) {
        System.out.println("once main");
        launch(args);
    }
}
