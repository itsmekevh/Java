import java.util.Scanner;
/* 
 * This program will create greeting cards based on the measurements 
 * inputted by the user and will calculate the area, the card size, 
 * and the price for a package of 6 cards.
 * 
 * Small card has an area <= 70cm and costs $1.25
 * Medium card has an area <= 240cm and costs $2.35
 * Large card has an area <= 450cm and costs $4.15
 * 
 * Cards are sold in packages of six. Make constant for cards per 
 * package (6)
 * 
 * To calculate area --> 0.5 * base * height;
 * 
 * Program will display: 1. Area of card in square centimeters
 * 						 2. Card Size (Small, Medium, Large)
 * 						 3. Price for package of six cards
 * 
 * If base || height < 0 give error message
 * If area > 450 print calculated area and error message.
 * 
 * 
 * Kevin Hung Hoang 06/29/21
 * 
 */


public class GreetingCards {
	
	static final int CARDS_PER_PACKAGE = 6;
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter length of base of card in cm: ");
		double base = input.nextDouble();
		
		System.out.print("Enter the height of the card: ");
		double height = input.nextDouble();
		
		if (base < 0 || height < 0) {
			System.out.println("Base and height must be positive.");
			//Exit here because code will continue running without it even if condition is met.
			System.exit(0);
		}
		
		double area = (0.5 * base * height);
		System.out.printf("The area of your card is %.1f square cm.", area);
		
		if (area > 450) {
			System.out.println("\nWe cannot make a card that large, sorry.");
		} else {
			double cost = 0.0;
			if (area <= 70) {
				System.out.println("\nThat is a small card.");
				cost = 1.25 * CARDS_PER_PACKAGE;
			} else if (area <= 240) {
				System.out.println("\nThat is a medium card.");
				cost = 2.35 * CARDS_PER_PACKAGE;
			} else if (area <= 450) {
				System.out.println("\nThat is a large card.");
				cost = 4.15 * CARDS_PER_PACKAGE;
			}
		System.out.printf("Your total cost for a package of " + CARDS_PER_PACKAGE + " cards is $%.2f.", cost);
		}

		
		input.close();
		
	}
}

