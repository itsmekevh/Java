import java.util.Scanner;
/*
 * Write a program that prompts the user to enter three 
 * points, (x1, y1), (x2, y2), and (x3, y3), of a triangle 
 * then displays its area.
 * All coordinates are double values because they have decimals.
 *  
 * Kevin Hung Hoang 06/15/21
 * 
 */


public class Quadrant {
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter x and y coordinates, seperated by spaces: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		if (x == 0 && y == 0){
			System.out.println("That is the origin.");
		} else if (x == 0.0) {
			System.out.println("That is on the y-axis.");
		} else if (y == 0.0) {
			System.out.println("That is on the x-axis.");
		} else {
			// do another if else if chain for quadrants
			if (x > 0.0 && y > 0.0) {
				System.out.println("That is in quadrant I.");
			} else if (x < 0.0 && y > 0.0) {
				System.out.println("That is in quadrant II.");
			} else if (x < 0.0 && y < 0.0) {
				System.out.println("That is in quadrant III");
			} else if (x > 0.0 && y < 0.0) {
				System.out.println("That is in qudrant IV");
			}
		}
	}
}
