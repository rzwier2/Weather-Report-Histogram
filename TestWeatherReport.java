/*
 * +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+
 * Object-Oriented Programming: Project 3
 * @date 10/27/2019
 * @author Ryan Zwier
 * 
 * This file is a class. It draws a bar graph using 
 * javafx. The bars are the averages for a particular 
 * month  next to the monthly average for the last year 
 +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+ 
 Went to drop-in hours and worked through difficulties with David Hudak,
 Elizabeth Cassibry, and Colin Brown
*/

import javafx.application.Application;
import javafx.scene.layout.Pane;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Line;

public class TestWeatherReport extends Application {
	String[] monthList = new String[] {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {  
	  
	  WeatherReport testWeather = new WeatherReport();
	  
	  Pane pane = new Pane();
	  Scene scene = new Scene(pane, 1400, 750, Color.LIGHTGRAY);
	  double year = testWeather.getYear();
	  int year2 = (int)year;
	  primaryStage.setTitle("Rainfall Graph: " + year2);
	  primaryStage.setScene(scene);
	  primaryStage.show();
	  
	  Text meYaFatha = new Text(640, 60, "Rainfall Graph: " + year2);
	    meYaFatha.setFont(Font.font("Courier", FontWeight.BOLD, FontPosture.ITALIC, 15));
	    pane.getChildren().add(meYaFatha);
	  
	  // KEY: describes which color describes what
	  Text keyAVG = new Text(1150, 100, "AVG ");
	  pane.getChildren().add(keyAVG);
	  Rectangle r3 = new Rectangle(1200, 80, 30, 30);
	  r3.setStroke(Color.BLACK);
	  r3.setFill(Color.BLUE);
	  pane.getChildren().add(r3);
	  
	  Text lastAVG = new Text(1125, 70, "Last Year");
	  pane.getChildren().add(lastAVG);
	  Rectangle r4 = new Rectangle(1200, 50, 30, 30);
	  r4.setStroke(Color.BLACK);
	  r4.setFill(Color.GREEN);
	  pane.getChildren().add(r4);
	    
	  // x-axis and y-axis
	  Line yln = new Line(200, 100, 200, 600);
	  yln.setStroke(Color.BLACK);
	  Line xln = new Line(1200, 600, 200, 600);
	  xln.setStroke(Color.BLACK);
	  
	  pane.getChildren().add(xln);
	  pane.getChildren().add(yln);
    
	  // Month tick-marks
	  int initial = 260;
	  for(int i = 0; i < 12; ++i) {
		  Line month1 = new Line(initial, 590, initial, 610);
		  month1.setStroke(Color.BLACK);
		  pane.getChildren().add(month1);
		  initial += 80;
	  }
	  
	  // Average rainfall tick-marks
	  int setValue = 100;
	  for(int i = 0; i < 10; ++i) {
		  Line rf1 = new Line(190, setValue, 210, setValue);
		  rf1.setStroke(Color.BLACK);
		  pane.getChildren().add(rf1);
		  setValue = setValue + 50;
	  }
	  
	  // Month Labels
	  int monthIndex = 250;
	  for (int i = 0; i < monthList.length; ++i) {
		  Text text1 = new Text(monthIndex, 625, monthList[i]);
		  pane.getChildren().add(text1);
		  monthIndex+= 80;
	  }
		  	  
	  // Rainfall labels
	  Text text2 = new Text(165, 555, "1.5");
	  pane.getChildren().add(text2);	  
	  Text text3 = new Text(165, 505, "3");
	  pane.getChildren().add(text3);	  
	  Text text4 = new Text(165, 455, "4.5");
	  pane.getChildren().add(text4);	  
	  Text text5 = new Text(165, 405, "6");
	  pane.getChildren().add(text5);	  
	  Text text6 = new Text(165, 355, "7.5");
	  pane.getChildren().add(text6);	  
	  Text text7 = new Text(165, 305, "9");
	  pane.getChildren().add(text7);	  
	  Text text8 = new Text(155, 255, "10.5");
	  pane.getChildren().add(text8);	  
	  Text text9 = new Text(165, 205, "12");
	  pane.getChildren().add(text9);	  
	  Text text10 = new Text(155, 155, "13.5");
	  pane.getChildren().add(text10);	  
	  Text text11 = new Text(165, 105, "15");
	  pane.getChildren().add(text11);
	  Text rainLabel = new Text(50, 305, "Average Rainfall \n        (in mm)");
	  pane.getChildren().add(rainLabel);
	  Text monthLabel = new Text(640, 680, "Month");
	  pane.getChildren().add(monthLabel);
	
	  // Move the rectangles right and set the rights for sum average
	  int moveRight = 240;
	  for (int i = 0; i < 12; ++i) {
		  double y = testWeather.getAverage(i+1);
		  double height = y * 33; 
		  Rectangle r1 = new Rectangle(moveRight, 600 - height, 20, height);
		    r1.setStroke(Color.BLACK);
		    r1.setFill(Color.BLUE);  
		    pane.getChildren().add(r1);
		    moveRight += 80;
	  }
	  
	  // Move the bars right for the last year
	  int moveLast = 260;
	  for (int i = 0; i < 12; ++i) {
		  double lastYear = testWeather.getLast(i+1);
		  double height2 = lastYear * 33;
		  
		  Rectangle r1 = new Rectangle(moveLast, 600 - height2, 20, height2);
		    r1.setStroke(Color.BLACK);
		    r1.setFill(Color.GREEN);  
		    pane.getChildren().add(r1);
		    moveLast += 80;
	  }
	 
  
  
  }
    public static void main(String[] args) {
        Application.launch(args);
        
        
    }
}