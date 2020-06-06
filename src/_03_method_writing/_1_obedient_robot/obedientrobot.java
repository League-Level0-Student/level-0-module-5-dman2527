package _03_method_writing._1_obedient_robot;
import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;
public interface obedientrobot {
	Robot luca = new Robot();
public static void main(String[] args) {
String color = 	JOptionPane.showInputDialog("In what color would you like to draw? (red,black,blue,green or orange");

if(color .equals("red")) {
	luca.setPenColor(Color.red);
}
if(color .equals("black")) {
	luca.setPenColor(Color.black);
}
if(color .equals("blue")) {
	luca.setPenColor(Color.blue);
}
if(color .equals("green")) {
	luca.setPenColor(Color.green);
}
if(color .equals("orange")) {
	luca.setPenColor(Color.orange);
}
String shape = 	JOptionPane.showInputDialog("What shape would you like to draw?");
if(shape .equals("triangle")) {	
	triangle();
}
if(shape .equals("square")) {
	square();
}
if(shape .equals("circle")) {
	circle();
}
}

public static void triangle() {
	String color = 	JOptionPane.showInputDialog("In what color would you like to draw?");
	luca.setSpeed(100);
	luca.penDown();
	luca.turn(120);
	luca.move(75);
	luca.turn(120);
	luca.move(75);
	luca.turn(120);
	luca.move(75);
	luca.hide();
}
public static void square() {
	String color = 	JOptionPane.showInputDialog("In what color would you like to draw?");
	luca.setSpeed(100);
	luca.penDown();
	luca.move(100);
	luca.turn(90);
	luca.move(100);
	luca.turn(90);
	luca.move(100);
	luca.turn(90);
	luca.move(100);

}
public static void circle() {
	
	luca.penDown();
	luca.setSpeed(100);
	
	for(int i = 1; i <= 36; i++) {
		luca.move(10);
		luca.turn(10);
		luca.hide();
	}
}
}
