import java.util.Scanner;
/*
 * 
 * Kevin Hung Hoang 06/21/21
 * 
 */


public class Nancy {
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number between 0 and 15: ");
		int num = input.nextInt();
		if (num >= 15) {
				System.out.println("Highest num so far is : " + num);
				System.out.println("This is outside the specified range, program will now exit");
				System.exit(0);
			}
		
		for (int i = 0; i <= 14; i++) {
			System.out.print(i + " Enter next number: ");
			int num2 = input.nextInt();
			if (num2 > num) {
				num = num2;
			}
			if (num >= 15) {
				break;
			}
		}
		System.out.println("Highest num so far is : " + num);
		
		input.close();
	}
}

