package com.fx.sample;
// Java Program to create a StackPane,
// add circle, label, rectangle
// and add it to the stage
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.scene.paint.*;
import javafx.scene.canvas.*;
import javafx.scene.text.*;
import javafx.scene.Group;
import javafx.scene.shape.*;

public class StackPane_1 extends Application {

	// launch the application
	public void start(Stage stage)
	{

		try {

			// set title for the stage
			stage.setTitle("StackPane");

			// create a label
			Label label = new Label("Welcome to JavaFX");

			// set Font for label
			label.setFont(new Font(30));

			// create a circle
			Circle circle = new Circle(100, 100, 70);

			// set fill for the circle
			circle.setFill(Color.BLUE);

			// create Rectangle
			Rectangle rectangle = new Rectangle(50, 50, 100, 100);
			// set fill for rectangle
			rectangle.setFill(Color.RED);

			// create a stack pane
			StackPane stack_pane = new StackPane(label, rectangle);

			// create a scene
			Scene scene = new Scene(stack_pane, 400, 300);

			// set the scene
			stage.setScene(scene);

			stage.show();
		}

		catch (Exception e) {

			System.out.println(e.getMessage());
		}
	}

	// Main Method
	public static void main(String args[])
	{

		// launch the application
		launch(args);
	}
}
