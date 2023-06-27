package com.fx.sample;

import java.io.FileInputStream;
import java.io.InputStream;

import javax.swing.text.html.ImageView;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.scene.layout.GridPane;
import javafx.scene.text.*;
import javafx.stage.Stage;

public class Training extends Application {

	int default_width = 200;
	RegistrationDetails details = new RegistrationDetails();

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {

		TilePane tp = new TilePane();

		GridPane root = new GridPane();
		root.setAlignment(Pos.CENTER);

		GridPane root2 = new GridPane();
		root2.setAlignment(Pos.CENTER);

		Scene registrationPage = new Scene(root, 900, 500);
		Scene registrationCompltedPage = new Scene(root2, 900, 500);
		
		
		String labelStr = "Thank You For Your Enrollment";
		Label Gb = new Label(labelStr);
		root2.addRow(0, Gb);

		Button btn2 = new Button();
		btn2.setText("Back");
		root2.addRow(1, btn2);
		btn2.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {

				System.out.println("Back button clicked");
				primaryStage.setScene(registrationPage);

			}
		});

		Label L1 = new Label("Name");
		L1.setFont(new Font(15));
		TextField Name_Field = new TextField();
		Name_Field.setMaxWidth(default_width);
		root.addRow(0, L1, Name_Field);

		Label L2 = new Label("Email ID");
		L2.setFont(new Font(15));
		TextField Email_Id_Field = new TextField();
		Email_Id_Field.setMaxWidth(default_width);
		root.addRow(1, L2, Email_Id_Field);

		Label L3 = new Label("Phone Number");
		L3.setFont(new Font(15));
		TextField Phone_number_Field = new TextField();
		Phone_number_Field.setMaxWidth(default_width);
		root.addRow(2, L3, Phone_number_Field);

		Label L4 = new Label("Date");
		L4.setFont(new Font(15));
		DatePicker Date_Field = new DatePicker();
		tp.getChildren().add(Date_Field);
		root.addRow(3, L4, tp);

		Label L5 = new Label("Course List");
		L5.setFont(new Font(15));
		String S1[] = { "B.E.Computer Science and Engineering", "B.Tech Informayion Technology" };
		ComboBox Course_List_Field = new ComboBox(FXCollections.observableArrayList(S1));
		TilePane tp2 = new TilePane(Course_List_Field);
		root.addRow(4, L5, Course_List_Field);

		Label L6 = new Label("Course Duration");
		L6.setFont(new Font(15));
		String S2[] = { "1 Year", "2 Year", "3 Year", "4 Year" };
		ComboBox Course_duration_Field = new ComboBox(FXCollections.observableArrayList(S2));
		TilePane tp3 = new TilePane(Course_duration_Field);
		root.addRow(5, L6, Course_duration_Field);

		Label L7 = new Label("Payment Ammount");
		L7.setFont(new Font(15));
		TextField Payment_amount_Field = new TextField();
		Payment_amount_Field.setMaxWidth(default_width);
		root.addRow(6, L7, Payment_amount_Field);

		Label L8 = new Label("Couse Starting Date");
		L8.setFont(new Font(15));
		DatePicker Course_starting_date_Field = new DatePicker();
		TilePane tp4 = new TilePane();
		tp4.getChildren().add(Course_starting_date_Field);
		root.addRow(7, L8, tp4);

		Button btn = new Button();
		btn.setText("Submit");
		root.addRow(16, btn);
		Name_Field.setFocusTraversable(true);
		btn.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
                
				details.Name = Name_Field.getText();
				details.Email_Id = Email_Id_Field.getText();
				details.Phone_no = Phone_number_Field.getText();
				details.Course = Course_List_Field.getValue().toString();
				details.Course_Duretion = Course_duration_Field.getValue().toString();
				details.amount_to_pay = Payment_amount_Field.getText();
				details.course_start_date = Course_starting_date_Field.getValue().toString();

				System.out.println(" MM :" + details.toString());

				primaryStage.setScene(registrationCompltedPage);
				primaryStage.show();

			}
		});

		StackPane foot = new StackPane();

		primaryStage.centerOnScreen();
		primaryStage.setScene(registrationPage);
		primaryStage.show();
	}
}