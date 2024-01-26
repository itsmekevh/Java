import java.util.Scanner;
/*
 * calculate average number of items sold per day
 * (with decimal points)
 * 
 * 1. Prompt user for # of items sold total (integer)
 * 2. Read that in to a variable.
 * 3. Prompt user for # of days that the sale took place (integer)
 * 4. Read that into a variable
 * 5. calculate average items per days # items / # days
 * 6. display the result, properly labled.
 * 
 * Kevin Hung Hoang 06/15/21
 * 
 */


public class Average {
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many items did you sell total? ");
		int totalItems = input.nextInt();
		
		System.out.print("How many days did it take to sell them? ");
		int days = input.nextInt();
		
		// If I just say totalItems / days, thats integer / integer,
		// which gives me an integer result. I have to convince Java to
		// treat at least one of the variables as if it were a double.
		// do that with "cast"  
		
		double average = (double) totalItems / (double) days;
		
		System.out.println("Average items per day is " + average + ".");
	}
}

