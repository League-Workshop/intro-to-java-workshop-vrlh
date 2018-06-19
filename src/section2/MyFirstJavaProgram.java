package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot urrobotname = new Robot();
	urrobotname.setSpeed(1000);
	urrobotname.sparkle();
	urrobotname.penDown();
	urrobotname.setRandomPenColor();
	urrobotname.miniaturize();
	for (int i = 0; i < 4; i++) {
	urrobotname.turn(90);
	urrobotname.setRandomPenColor();
	urrobotname.move(100);
	}
	
	
	}
}
