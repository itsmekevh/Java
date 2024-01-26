import java.util.Scanner;
/*
 * This program will ask the user to enter a price for an item until the
 * user enters a price of -1. After entering -1, the program will calculate
 * and display the total number of items, the average price of all items
 * and the standard deviation of the prices. 
 * 
 * Kevin Hung Hoang 06/30/21
 * 
 */


public class Statistics {
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		double sum = 0.0;
		double sumOfSquares = 0.0;
		int nItems = 0;
		System.out.print("Enter your first price or -1 to exit: $");
		double price = input.nextDouble();
		
		do { 
			if (price != -1) {
				double priceSq = price * price;
				sum += price;
				sumOfSquares += priceSq;
				nItems++;
				System.out.print("Enter next price or -1 to exit : $");
				price = input.nextDouble();
			}
		} while (price != -1);
		
		System.out.println("Number of items: " + nItems);
		if (nItems == 0) {
			System.out.println("No data entered. Cannot calculate statistics.");
		} else {
			double average = sum / nItems; 
			System.out.printf("Average price is: $%.2f " , average);
			
			if (nItems > 1) {
				double sumOfPricesSQ = sum * sum;
				double stdev = Math.sqrt((sumOfSquares - (sumOfPricesSQ / nItems)) / (nItems - 1));
				System.out.printf("Standard deviation of prices is: $%.2f \n" , stdev);
			} else { 
				System.out.println("Cannot calculate standard deviation with only one item. \n");
			}
		}
		
		input.close();
	}
}

