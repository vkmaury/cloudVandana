package assignment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class suffleArray {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Create an array with the values (1, 2, 3, 4, 5, 6, 7)
	        List<Integer> list = new ArrayList<>();
	        for (int i = 1; i <= 7; i++) {
	            list.add(i);
	        }

	        // Shuffle the array
	        Collections.shuffle(list);

	        // Print the shuffled array
	        System.out.println("Shuffled Array: " + list);
	    }

}
