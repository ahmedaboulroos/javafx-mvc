package amin.demo;

import javafx.application.Application;
import javafx.stage.Stage;

public class AppMain extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void init() {
        // initialization code here
        // runs on: JavaFX Launcher Thread
    }

    @Override
    public void start(Stage primaryStage) {
        // application code starts here
        // runs on: JavaFX Application Thread
        primaryStage.show();
    }

    @Override
    public void stop() {
        // finalization code here
        // runs on: JavaFX Application Thread
    }

}
