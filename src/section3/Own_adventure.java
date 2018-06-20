package section3;

import javax.swing.JOptionPane;

public class Own_adventure {
	public static void main(String[] args) {
String name = JOptionPane.showInputDialog("Who will be part of this crazy adventure");
int go = 1;
int goin = 0;
while (go != 0) {
JOptionPane.showMessageDialog(null, 
		"Once upon a time... " + name +" was walking to the League of Amazing Programmers for his/hers new workshop");
	 go = JOptionPane.showConfirmDialog(null, "Did " + name + " walk inside?");
	}
	if(go == 0) {
		while (goin == 1) {
		JOptionPane.showMessageDialog(null, "You walk inside the building. You see expensive stuff everywhere." );
		goin = JOptionPane.showConfirmDialog(null, "Do you walk inside the classroom?");
	}
	}
	
	}
	
	
	}

