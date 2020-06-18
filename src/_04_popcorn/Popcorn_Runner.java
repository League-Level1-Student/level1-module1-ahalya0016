package _04_popcorn;

import javax.swing.JOptionPane;

public class Popcorn_Runner {
public static void main(String[] args) {
	String flavor = JOptionPane.showInputDialog(null, "What flavor popcorn would you like?");
	Popcorn pop = new Popcorn(flavor);
	Microwave microwave = new Microwave();
	microwave.putInMicrowave(pop);
	String cookTimeInMinutes = JOptionPane.showInputDialog(null, "How long do I heat it up for in minutes?");
	int cookTime = Integer.parseInt(cookTimeInMinutes);
	microwave.setTime(cookTime);
	
	
}
}
