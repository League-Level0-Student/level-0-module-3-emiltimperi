//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot robot = new Robot("batman");
		robot.hide();
		//3. Ask the user what color they would like the robot to draw
		String color = JOptionPane.showInputDialog(null, "what color do you want. Red, green, or blue.");
		//5. Use an if/else statement to set the pen color that the user requested
if (color.equalsIgnoreCase("blue")) {
	robot.setPenColor(0, 0, 500);
} 
if (color.equalsIgnoreCase("red")) {
	robot.setPenColor(500, 0, 0);
}
if (color.equalsIgnoreCase("green")) {
	robot.setPenColor(0, 500, 0);
}

        //6. If the user doesn’t enter anything, choose a random color
if (color.equals("")) {
	robot.setRandomPenColor();
}
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		robot.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
robot.penDown();
for (int i = 0; i < 4; i++) {
	

robot.move(50);
robot.turn(90);
	}
	}
}
