import java.util.Scanner;
/*
 * Ask user for unit price of item and the # purchased,
 * and it will give them the total amount they have to pay.
 * 
 * 0. Create an input Scanner.
 * 1. Prompt user for the unit price.
 * 2. Read it into Variable unitPrice
 * 3. Prompt user for quanity purchased.
 * 4. Read that into variable (quantity)
 * 5. Caclculate total (in a new variable) as unitPrice times quantity.
 * 6. Display the result, properly labeled. 
 *
 * Kevin Hoang 06/15/21
 */
 
 public class Invoice {
	 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter the unit price: $");
		double unitPrice = input.nextDouble();
		
		System.out.print("How many do you want to buy? ");
		int quantity = input.nextInt();
		
		double total = unitPrice * quantity;
		
		System.out.println("Your total price is $" + total + ".");
		
		input.close();
	}
 }
