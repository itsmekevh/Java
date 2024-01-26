import java.util.Scanner;
/*
 * 
 * 
 * 1. Prompt for and read the balance
 * 2. Prompt user for Deposit.
 * 3. if the amount > 0
 * 		3a. If the amount is >=10k then we give a message.
 * 		3b. print the new balance
 * 4. OTHERWISE:
 * 		4a. print error message - no negative amounts allowed.
 * 
 * 
 * 
 */
 
 public class Deposit2{
	 
	 public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter current balance: $");
		double balance = input.nextDouble();
		
		System.out.print("Enter amount to deposit: $");
		double depositAmount = input.nextDouble();
		
		if (depositAmount > 0) {
			if (depositAmount >= 10_000.000){
				System.out.println("Your funds are on hold until the transaction clears.");
			}
			
			balance = balance + depositAmount;
			
			System.out.printf("After depositing $%.2f, Your balance is $%.2f\n", depositAmount, balance);
		} else {
			System.out.println("Amount must be greater than zero.");
		}
			
		input.close();
	 }
 
	 
 }
