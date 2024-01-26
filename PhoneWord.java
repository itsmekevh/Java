import java.util.Scanner;
/*
 * This program will read a word or words that the user will input and 
 * print out a phone number that corresponds to the sequence of letters
 * in the word/words.
 * 
 * Kevin Hung Hoang 06/30/21
 * 
 */


public class PhoneWord {
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		String result = "";
		System.out.print("Enter a phone word: ");
		String pWord = input.nextLine();
		String pWordUpper = pWord.toUpperCase();
		
		for (int index = 0; index < pWord.length(); index++) {
			char letter = pWordUpper.charAt(index);
			
			Boolean number = Character.isDigit(pWord.charAt(index));
			if (number) {
				char n = pWordUpper.charAt(index);
				result += n;
			} else if (letter == 'A' || letter == 'B' || letter == 'C') {
				result += 2;
			} else if (letter == 'D' || letter == 'E' || letter == 'F') {
				result += 3;
			} else if (letter == 'G' || letter == 'H' || letter == 'I') {
				result += 4;
			} else if (letter == 'J' || letter == 'K' || letter == 'L') {
				result += 5;
			} else if (letter == 'M' || letter == 'N' || letter == 'O') {
				result += 6;
			} else if (letter == 'P' || letter == 'Q' || letter == 'R' || letter == 'S') {
				result += 7;
			} else if (letter == 'T' || letter == 'U' || letter == 'V') {
				result += 8;
			} else if (letter == 'W' || letter == 'X' || letter == 'Y' || letter == 'Z') {
				result += 9;
			}
			if (index == 2) {
				result += "-";
			}
		}
		
		if (result.length() >= 7) {
			String result7 = result.substring(0,8);
			System.out.print("The number is " + result7 + ".");
		} else {
			System.out.print("ERROR: The phone word is less than 7 digits.");
		}
		
		input.close();
	}
}

