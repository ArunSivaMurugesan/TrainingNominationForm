package com.fx.sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class FXlabel extends Application {

      public void start(Stage PrimaryStage) throws Exception {
        PrimaryStage.setTitle("Label Color");  // Setting the application title

        Label lbl = new Label("This is the colored text !!!"); // Creating a simple label with a text "This is the colored text !!!"
        lbl.setStyle("-fx-text-fill: red; -fx-background-color: yellow"); // Styling the text by applying necessary CSS properties.
        Scene scene = new Scene(lbl, 900, 700); // Creating a scene
        PrimaryStage.setScene(scene); // Setting the scene to stage
        PrimaryStage.show(); // Make the stage visible
    }

    public static void main(String[] args) {
        Application.launch(args);  // Launching the application
    }
}