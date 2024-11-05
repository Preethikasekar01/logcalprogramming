package Hello;
import java.util.Scanner;
public class SwapTwoNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(Syatem.in);

        //prompt for the first number
        System.out.print("Enter the first number:");
        int num1 = scanner .nextInt();

        //prompt for the second number
        System.out.print("Enter the second number:");
        int num2 = scanner.nextInt();

        //Display numbers beform swapping
        System.out.println("Beform swapping:");
        System.out.println("First number:"+num1);

        inyt temp =num1;
        num1 = num2;
        num2 =temp;


        //Display numbers after swapping
        System.out.println("After swapping:");
        System.out.println("First number:"+num1);
        System.out.println("Second number:"+num2);

        scanner.close();
        
    }
    
}
