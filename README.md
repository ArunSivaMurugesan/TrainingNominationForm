package com.fx.sample;


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
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.scene.layout.GridPane; 
import javafx.scene.text.*;
import javafx.stage.Stage;
 
public class Training extends Application {
	
	int default_width = 200;
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
    	
    	TilePane tp = new TilePane();
    	
    	GridPane root = new GridPane();
    	root.setAlignment(Pos.CENTER);
    	
    	Label L1 = new Label("Name");
    	L1.setFont(new Font(15));
        TextField tf1 = new TextField();
        tf1.setMaxWidth(default_width);
        root.addRow(0,L1, tf1);
        
        Label L2 = new Label("Email ID");
        L2.setFont(new Font(15));
        TextField tf2 = new TextField();
        tf2.setMaxWidth(default_width);
        root.addRow(1,L2, tf2);
        
        Label L3 = new Label("Phone Number");
        L3.setFont(new Font(15));
        TextField tf3 = new TextField();
        tf3.setMaxWidth(default_width);
        root.addRow(2,L3, tf3);
        
        Label L4 = new Label("Date");
        L4.setFont(new Font(15));
        DatePicker dp1 = new DatePicker();
        tp.getChildren().add(dp1);
        root.addRow(3,L4, tp);
        
        Label L5 = new Label("Course List");
        L5.setFont(new Font(15));
        String S1[] = {"B.E.Computer Science and Engineering","B.Tech Informayion Technology"};
        ComboBox Cb1 = new ComboBox(FXCollections.observableArrayList(S1));
        TilePane tp2 = new TilePane(Cb1);
        root.addRow(4, L5, Cb1);
        
        Label L6 = new Label("Course Duration");
        L6.setFont(new Font(15));
        String S2[] = {"1 Year","2 Year","3 Year","4 Year"};
        ComboBox Cb2 = new ComboBox(FXCollections.observableArrayList(S2));
        TilePane tp3 = new TilePane(Cb2);
        root.addRow(5,L6, Cb2);
        
        Label L7 = new Label("Payment Ammount");
        L7.setFont(new Font(15));
        TextField tf4 = new TextField();
        tf4.setMaxWidth(default_width);
        root.addRow(6,L7,tf4);
        
        Label L8 = new Label("Couse Starting Date");
        L8.setFont(new Font(15));
        DatePicker dp2 = new DatePicker();
        TilePane tp4 = new TilePane();
        tp4.getChildren().add(dp2);
        root.addRow(7,L8, tp4);
        
        Button btn = new Button();
        btn.setText("Submit");
        root.addRow(16, btn);
        tf1.setFocusTraversable(true);
        btn.setOnAction(new EventHandler<ActionEvent>() {
 
            @Override
            public void handle(ActionEvent event) {
            	
            	 final Label message = new Label("");
            	
                System.out.println("Welcome to Java");
                System.out.println("height :" + tf1.getHeight());
                System.out.println("width :" + tf1.getWidth());

                if ((!tf1.getText().equals("M.Arun Siva"))||(!tf2.getText().equals("marunsiva061003@gmail.com"))) {
                    message.setText("Your password is incorrect!");
                    message.setTextFill(Color.web("red"));
                  } else {
                    System.out.println("Navigate to the next page");
                  }
            }
        });
       
        
        
        StackPane foot = new StackPane();
        
        primaryStage.centerOnScreen();
        
        //root.getChildren().add(btn);
        
        primaryStage.setScene(new Scene(root,950, 500));
        
        primaryStage.show();
    }
}
