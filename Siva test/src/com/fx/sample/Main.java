package com.fx.sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
  @Override/*from   ww  w . ja  va  2 s .c o  m*/
  public void start(Stage primaryStage) {
    // Create a border pane 
    BorderPane pane = new BorderPane();

    // Place nodes in the pane
    pane.setLeft(getVBox());

    Scene scene = new Scene(pane);
    primaryStage.setTitle("java2s.com");
    primaryStage.setScene(scene);
    primaryStage.show();
  }
  
  private VBox getVBox() {
    VBox vBox = new VBox(15);
    vBox.setPadding(new Insets(25, 25, 25, 25));
    //	Label Heading1 = new Label("Training Enrollment - February");
    //Heading1.
    vBox.getChildren().add(new Label("Training Enrollment - February"));
    
    Label[] courses = {new Label("CSS"), new Label("HTML"), 
        new Label("Java"), new Label("Javascript")};

    for (Label course: courses) {
      VBox.setMargin(course, new Insets(0, 0, 0, 15));
      vBox.getChildren().add(course);
    }
    
    return vBox;
  }
  

  public static void main(String[] args) {
    launch(args);
  }
} 