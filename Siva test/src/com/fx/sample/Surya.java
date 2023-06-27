package com.fx.sample;



import java.io.FileInputStream;
import java.io.InputStream;
import java.io.IOException;

import javafx.application.Application;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;


public class Surya extends Application 
{
	
	public static void main(String args[])
	{
		launch(args);
	}
	
	@Override
	public void start(Stage primarystage)throws Exception 
	{
		
		GridPane foot = new GridPane();
		
		InputStream b = new FileInputStream("\"D:\\Siva\\Projects\\Tick Symbol\\Tick Symbol.png\"");
		Image Kb = new Image(b);
		ImageView Mb = new ImageView();
		Mb.setImage(Kb);
		
		Label Gb = new Label("Thank You For Your Enrollment",Mb);
		foot.addRow(0, Gb);
		
		
		
		Scene root = new Scene(Gb,500,300);
		primarystage.setScene(root);
		primarystage.show();
		
	}
}