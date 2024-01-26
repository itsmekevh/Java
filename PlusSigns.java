import java.util.Scanner;
/* 
 * This program asks the user for a number from 1 - 10 and prints out
 * an inverted amount of plus signs in a triangle formation depending on
 * the number of rows inputted.
 * 
 * Need 3 for loops
 * 
 * 1) First loop should run for entire amount inputted by user
 * 2) Second loop should print number os spaces
 * 3) Third loop should print the + signs depending on the row and plusRow
 * 		amounts
 * 
 * Kevin Hung Hoang 06/24/21
 * 
 */


public class PlusSigns {
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a number from 1-10: ");
		
		int rows = input.nextInt();
		
		for (int plusRows = 0; plusRows < rows; pRows++)
		{
			for (int space = 0; space < plusRows; space++)
			{
				System.out.print(" ");
			}
			for (int plus = 0; plus < ((2 * rows - 1) - (plusRows * 2)); plus++)
			{
				System.out.print("+");
			}
			System.out.println();
				 	 
		}
		input.close();
	}
}

