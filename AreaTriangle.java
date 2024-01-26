import java.util.Scanner;
/*
 * Write a program that prompts the user to enter three 
 * points, (x1, y1), (x2, y2), and (x3, y3), of a triangle 
 * then displays its area.
 * All coordinates are double values because they have decimals.
 * 
 * The formula for each side: side1 = (x1 - x2)^2 + (y1 - y2)^2
 * 							  side2 = (x2 - x3)^2 + (y2 - y3)^2
 * 							  side3 = (x1 - x3)^2 + (y1 - y3)^2
 * 
 * The formula for s is (side1 + side2 + side3) / 2
 * 
 * the formula for area is the sqrt(s(s-side1)(s-side2)(s-side3))
 * 
 * Kevin Hung Hoang 06/16/21
 * 
 */


public class AreaTriangle {
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the coordinates of three points separated by spaces");
		System.out.print("in the order x1 y1 x2 y2 x3 y3: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		
		double side1, side2, side3, s, area;
		
		side1 = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)); 
		side2 = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2)); 
		side3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
		
		s = (side1 + side2 + side3) / 2;
		
		area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		
		System.out.printf("The area of the triangle is %.1f square units", area);
		
	}
}
