package section3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
speak("mandlebrot.");
		// 2. Catch the user's answer in a String
String spelling = JOptionPane.showInputDialog("Spelling");
		// 3. If the user spelled the word correctly, speak "correct"
if (spelling.equals ("mandlebrot")) {
	speak("correct");
}
		// 4. Otherwise say "wrong"
else {
	speak ("loser, HAHAHAHAHAHAHAHAAH.");
}
		// 5. repeat the process for other words
speak("amazing.");
// 2. Catch the user's answer in a String
String spelling2 = JOptionPane.showInputDialog("Spelling");
// 3. If the user spelled the word correctly, speak "correct"
if (spelling2.equals ("amazing")) {
speak("correct");
}
// 4. Otherwise say "wrong"
else {
speak ("loser, HAHAHAHAHAHAHAHAAH.");

speak("league.");
// 2. Catch the user's answer in a String
String spelling3 = JOptionPane.showInputDialog("Spelling");
// 3. If the user spelled the word correctly, speak "correct"
if (spelling3.equals ("league")) {
speak("correct");
}
// 4. Otherwise say "wrong"
else {
speak ("loser, HAHAHAHAHAHAHAHAAH.");
}
speak("of.");
//2. Catch the user's answer in a String
String spelling4 = JOptionPane.showInputDialog("Spelling");
//3. If the user spelled the word correctly, speak "correct"
if (spelling4.equals ("of")) {
speak("correct");
}
//4. Otherwise say "wrong"
else {
speak ("loser, HAHAHAHAHAHAHAHAAH.");
}
speak("programmers.");
//2. Catch the user's answer in a String
String spelling5 = JOptionPane.showInputDialog("Spelling");
//3. If the user spelled the word correctly, speak "correct"
if (spelling5.equals ("programmers")) {
speak("correct");
}
//4. Otherwise say "wrong"
else {
speak ("loser, HAHAHAHAHAHAHAHAAH.");
}

}
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}


