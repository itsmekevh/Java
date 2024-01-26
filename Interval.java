import java.util.Scanner;
/* This program will read 2 seperate time intervals, calculate the minutes
 * in each interval and which one is longer, and if the intervals are equal
 * length then the output will say that they are equal.
 * 
 * Game Plan:
 * 1) Get values for hour and minutes for earlier and later times
 *		-If the times are not in correct order, error will show and allow
 *		reassignment
 * 2) Split the numbers into Hours and Minutes
 *		-Divide and remainder by 100
 * 3) Figure out interval length
 *		-Multiply hours x 60 and add minutes
 * 4) Compare the resulting lengths
 * 5) Check if they overlap
 * 		-If the start time of the SECOND interval (late1) is BEFORE the end time
 *			of the FIRST interval (early2)
 * 
 * 
 * Kevin Hung Hoang 06/22/21
 * 
 */


public class Interval {
	public static int splitH(int interval1){
		int hour;
		hour = interval1 / 100;
		return hour;
	}
	public static int splitM(int interval2){
		int min;
		min = interval2 % 100;
		return min;
	}
	public static int hourLength(int hour1, int hour2){
		int hLength;
		hLength = ((hour2 - hour1) * 60);
		return hLength;
	}

	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter earlier start and end time as two 24-hour format times: ");
		int early1 = input.nextInt();
		int early2 = input.nextInt();
		
		//Reassigning times if wrong order was entered
		if (early2 < early1) {
			System.out.println("The later time you entered is larger than the earlier time.");
			System.out.print("Please enter the time interval again in correct order: ");
			int newEarly1 = input.nextInt();
			int newEarly2 = input.nextInt();
			early1 = newEarly1;
			early2 = newEarly2;
		}
		
		System.out.print("Enter later start and end time as two 24-hour format times: ");
		int late1 = input.nextInt();
		int late2 = input.nextInt();
		
		//Reassigning times if wrong order was entered
		if (late2 < late1) {
			System.out.println("The later time you entered is larger than the earlier time.");
			System.out.print("Please enter the time interval again in correct order: ");
			int newLate1 = input.nextInt();
			int newLate2 = input.nextInt();
			late1 = newLate1;
			late2 = newLate2;
		}
		
		//Spliting hours and minutes 
		int splitHour1 = splitH(early1);
		int splitMin1 = splitM(early1);
		int splitHour2 = splitH(early2);
		int splitMin2 = splitM(early2);
		int splitHour3 = splitH(late1);
		int splitMin3 = splitM(late1);
		int splitHour4 = splitH(late2);
		int splitMin4 = splitM(late2);
		
		//Calculating interval length
		int lengthH1 = hourLength(splitHour1, splitHour2);
		int lengthM1 = splitMin2 - splitMin1;
		int lengthT1 = lengthH1 + lengthM1;
		System.out.println("The earlier interval is " + lengthT1 + " minutes long.");
		
		int lengthH2 = hourLength(splitHour3, splitHour4);
		int lengthM2 = splitMin4 - splitMin3;
		int lengthT2 = lengthH2 + lengthM2;
		System.out.println("The later interval is " + lengthT2 + " minutes long.");
		
		// Comparing interval lengths
		if (lengthT1 > lengthT2){
			System.out.println("The earlier interval is longer.");
		} else if (lengthT1 < lengthT2) {
			System.out.println("The later interval is longer.");
		}
		
		//Determining Overlap
		if (late1 <= early2) {
			System.out.println("These intervals overlap each other.");
		} else if (late1 > early2){
			System.out.println("These intervals do not overlap each other.");
		}
		
		input.close();
	}
}

