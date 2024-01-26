import java.util.Scanner;
/*
 * ask user for what percent p of their maximum heart rate they achieved
 * and display how good their workout was 
 * 
 * 
 * 
 * 
 * 
 */


public class HeartRateImproved {
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("What % of your max heart rate did you achieve?");
		int percent = input.nextInt();
		
		if (percent < 0){
			System.out.println("that is not possible sorry");
		} else if (percent < 30) {
			System.out.println("DID YOU EVEN MOVE?");
		} else if (percent < 50) {
			System.out.println("extremely light exercise");
		} else if (percent < 60) {
			System.out.println("very light exercise");
		} else if (percent < 70) {
			System.out.println("light exercise");
		} else if (percent < 80) {
			System.out.println("moderate exercise");
		} else if (percent < 90) {
			System.out.println("Hard exercise!!!");
		} else {
			System.out.println("CHILL OUT MAN");
		}
		
		input.close();
	}
}

