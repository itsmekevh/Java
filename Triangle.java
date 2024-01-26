import java.util.Scanner;
/*
 * Ask the user for lengths of the three sides of a triangle
 * Compute the perimeter if the input is valid
 * The input is valid if the sum of 2 sides is is greater than the remaining
 * side.
 * If the input is not valid display error message.
 * 
 * Game plan:
 * 1) Ask user for 3 inputs for sides ex. 3 4 5
 * 2) Check if the input is valid
 * 3) If input is invalid display error message
 * 4) If the input is valid, computer the perimeter and print
 * 
 * Kevin Hung Hoang 06/21/21
 * 
 */


public class Triangle {
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);	
		System.out.print("Enter the length of the sides of the triangle: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		if (a + b < c || a + c < b || c + b < a){
			System.out.print("Those sides do not specify a valid triangle.");	
		} else if (a + b > c || a + c > b || c + b > a){
			double perimeter = a + b + c;
			System.out.printf("The perimeter of the triangle is %.1f ", perimeter);
		}
		
		input.close();
	}
}

