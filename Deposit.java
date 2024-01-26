import java.util.Scanner;
/*
 * 
 * 
 * 1. Prompt for and read the balance
 * 2. Prompt user for Deposit.
 * 
 * 
 * 
 */
 
 public class Deposit{
	 
	 public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter current balance: $");
		double balance = input.nextDouble();
		
		System.out.print("Enter amount to deposit: $");
		double depositAmount = input.nextDouble();
		
		if (depositAmount >= 10_000.000){
			System.out.println("Your funds are on hold until the transaction clears.");
		}
		
		balance = balance + depositAmount;
		
		System.out.printf("After depositing $%.2f, Your balance is $%.2f\n", depositAmount, balance);
		
		
		input.close();
	 }
	 
	 
 }
