package com.fx.sample;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
public class ImageViewExample extends Application {
   public void start(Stage stage) throws Exception {
      //creating the image object
      InputStream stream = new FileInputStream("\"D:\\Siva\\Projects\\Tick Symbol\\Tick Symbol.png\"");
      Image image = new Image(stream);
      //Creating the image view
      ImageView imageView = new ImageView();
      //Setting image to the image view
      imageView.setImage(image);
      //Setting the image view parameters
      imageView.setX(10);
      imageView.setY(10);
      imageView.setFitWidth(575);
      imageView.setPreserveRatio(true);
      //Setting the Scene object
      Group root = new Group(imageView);
      Scene scene = new Scene(root, 595, 370);
      stage.setTitle("Displaying Image");
      stage.setScene(scene);
      stage.show();
   }
   public static void main(String args[]) {
      launch(args);
   }
}