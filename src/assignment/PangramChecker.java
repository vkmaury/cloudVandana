package assignment;
import java.util.Scanner;

public class PangramChecker {
	 public static boolean isPangram(String input) {
		 // Create an array to track the presence of each alphabet letter
	        boolean[] alphabetPresent = new boolean[26];

	        // Convert the input string to lowercase for case-insensitive checking
	        input = input.toLowerCase();

	        for (int i = 0; i < input.length(); i++) {
	            char c = input.charAt(i);
	            if ('a' <= c && c <= 'z') {
	                // Mark the corresponding letter as present
	                alphabetPresent[c - 'a'] = true;
	            }
	        }

	        // Check if all alphabet letters are present
	        for (boolean letterPresent : alphabetPresent) {
	            if (!letterPresent) {
	                return false; // Not a pangram
	            }
	        }

	        return true; // It's a pangram
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a sentence: ");
	        String input = scanner.nextLine();

	        boolean isPangram = isPangram(input);
	        if (isPangram) {
	            System.out.println("The input is a pangram.");
	        } else {
	            System.out.println("The input is not a pangram.");
	        }
	    }


}
