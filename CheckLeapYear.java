package Hello;
import java.util.Scanner;
public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year :");
    int year = scanner.nextInt();


    // Check if the year is a leap year
    if (isLeapYear(year)) {
        System.out.println(year + " is a leap year.");
    } else {
        System.out.println(year + " is not a leap year.");
    }

    // Close the scanner to avoid resource leaks
    scanner.close();
}

// Method to check if a year is a leap year
public static boolean isLeapYear(int year) {
    // A year is a leap year if it is divisible by 4
    // But not divisible by 100, unless it is also divisible by 400
    if (year % 4 == 0) {
        if (year % 100 == 0) {
            return year % 400 == 0; // Divisible by 400
        }
        return true; // Divisible by 4 but not by 100
    }
    return false; // Not a leap year
    
}
}


