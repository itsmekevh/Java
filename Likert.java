import java.util.Scanner;
/*
 * Dice
 */


public class Likert {
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number from 1-6: ");
		int answer = input.nextInt();
		if (answer >= 1 && answer <=6) {
			switch (answer) {
				case 1:
					System.out.println("Strongly disagree");
					break;
				case 2:
					System.out.println("disagree");
					break;
				case 3:
					System.out.println("Somewhat disagree");
					break;
				case 4:
					System.out.println("somewhat agree");
					break;
				case 5:
					System.out.println("agree");
					break;
				case 6:
					System.out.println("Strongly agree");
					break;
				}
		}
		
	}
}

