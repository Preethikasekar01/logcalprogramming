package Hello;

import java.util.scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter a number: ");
		        int number = scanner.nextInt();
		        int originalNumber = number;
		        int sum = 0;
		        int digits = String.valueOf(number).length();

		        // Calculate the sum of the digits raised to the power of the number of digits
		        while (number > 0) {
		            int digit = number % 10;
		            sum += Math.pow(digit, digits);
		            number /= 10;
		        }

		        // Check if the sum is equal to the original number
		        if (sum == originalNumber) {
		            System.out.println(originalNumber + " is an Armstrong number.");
		        } else {
		            System.out.println(originalNumber + " is not an Armstrong number.");
		        }

		        scanner.close();
		
	}
}
