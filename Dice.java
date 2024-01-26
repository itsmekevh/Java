import java.util.Scanner;
/*
 * Dice
 */


public class Dice {
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		int diel = 1 + (int) (Math.random () * 6);
		int die2 = 1 + (int) (Math.random () * 6);
		int total = die1 + die2;
		
		System.out.printf("You rolled %d and %d for a total of %d.\n", die1, die2, total);
		
	}
}

