package com.fx.sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Voila extends Application {

  final Label message = new Label("");

  @Override
  public void start(Stage stage) {
    Group root = new Group();
    Scene scene = new Scene(root, 260, 80);
    stage.setScene(scene);
    stage.setTitle("Password Field Sample");

    VBox vb = new VBox();
    vb.setPadding(new Insets(10, 0, 0, 10));
    vb.setSpacing(10);
    HBox hb = new HBox();
    hb.setSpacing(10);
    hb.setAlignment(Pos.CENTER_LEFT);

    Label label = new Label("Password");
    final PasswordField pb = new PasswordField();

    pb.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent e) {
        if (!pb.getText().equals("abc")) {
          message.setText("Your password is incorrect!");
          message.setTextFill(Color.web("red"));
        } else {
          message.setText("Your password has been confirmed");
          message.setTextFill(Color.web("black"));
        }
        pb.setText("");
      }
    });

    hb.getChildren().addAll(label, pb);
    vb.getChildren().addAll(hb, message);

    scene.setRoot(vb);
    stage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}