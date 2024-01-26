import java.util.Scanner;
/*
 * Dice
 */


public class LikertImproved {
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number from 1-6: ");
		int answer = input.nextInt();
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
				default: 
					System.out.println("Sorry, that isn't from 1-6");
					break;
				}
		}
		
	}

