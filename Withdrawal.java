import java.util.Scanner;
/*
 * 1. prompt for and read balance
 * 2. prompt for and read amount to withdraw
 * 3. 
 * 
 * 
 * 
 */


public class Withdrawal {
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter current balance: $");
		double balance = input.nextDouble();
		
		System.out.print("Enter amount to withdraw: $");
		double withdrawalAmount = input.nextDouble();
		
		if (withdrawalAmount <= balance){
			balance -= withdrawalAmount;
			System.out.printf("Your balance is now $%.2f.\n", balance);
		} else {
			System.out.println("You cannot withdraw more than you have.");
		}
		
		input.close();
	}
}

