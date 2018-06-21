package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = 0;
		// 2.  Ask the user a question 
		String answer = JOptionPane.showInputDialog("What is 9 + 10?");
		// 3.  Use an if statement to check if their answer is correct
		if (answer.equals("21")) {
			score++;
		}
		// 4.  if the user's answer is correct
		
		// -- add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		String answer2 = JOptionPane.showInputDialog("What is 1 + 1?");
		// 3.  Use an if statement to check if their answer is correct
		if (answer2.equals("window")) {
			score++;
		}
		String answer3 = JOptionPane.showInputDialog("What happens if you answer this question correctly?");
		// 3.  Use an if statement to check if their answer is correct
		if (answer3.equals("you get an extra point")) {
			score++;
		}
		// 6.  After all the questions have been asked, print the user's score 
		JOptionPane.showMessageDialog(null, "You have a final score of " + score + " out of 3");
	}
}
