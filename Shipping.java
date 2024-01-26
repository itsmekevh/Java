import java.util.Scanner;
/*
 * This program will calculate the cost in dollars based on the weight
 * of the package in pounds.
 * 
 * Weight			    Cost
 * 0  <  w <= 2         3.50
 * 2  <  w <= 8 		5.70
 * 8  <  w <= 17		9.50
 * 17 <  w <= 25		12.35
 * 
 * Game plan:
 * 1) Ask user for the weight of the package and display the shipping cost
 * 2) If the weight is negative or zero (display error message x > 0)
 * 3) if weight is greater than 25 display error message
 * 
 * Kevin Hung Hoang 06/21/21
 * 
 */


public class Shipping {
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter weight of package in pounds: ");
		
		double weight = input.nextDouble();
		
		if (weight > 0.0 && weight <= 2.0){
			double cost = 3.50;
			System.out.printf("Cost: $%.2f", cost);
		} else if (weight > 2 && weight <= 8) {
			double cost = 5.70;
			System.out.printf("Cost: $%.2f", cost);
		} else if (weight > 8 && weight <= 17) {
			double cost = 9.50;
			System.out.printf("Cost: $%.2f", cost);
		} else if (weight > 17 && weight <= 25) {
			double cost = 12.35;
			System.out.printf("Cost: $%.2f", cost);
		} else if (weight < 0) {
			System.out.print("Weight must be greater than zero.");
		} else if (weight > 25) {
			System.out.print("Cannot ship - maximum weight is 25 pounds");
		}
		
		input.close();
	}
}

