package Hello ;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class DuplcateCharacterofString {
	public static void main(String[] args) {
		// TODO Auto-generated method stubs
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter a string: ");
		        String input = scanner.nextLine();

		        // Create a map to store character counts
		        Map<Character, Integer> charCountMap = new HashMap<>();

		        // Count occurrences of each character
		        for (char c : input.toCharArray()) {
		            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
		        }

		        // Print duplicate characters
		        System.out.println("Duplicate characters:");
		        boolean hasDuplicates = false;
		        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
		            if (entry.getValue() > 1) {
		                System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
		                hasDuplicates = true;
		            }
		        }

		        if (!hasDuplicates) {
		            System.out.println("No duplicate characters found.");
		        }

		        scanner.close();
	}

}

    

