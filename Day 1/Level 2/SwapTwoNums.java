import java.util.Scanner;

public class SwapTwoNums {
    public static void main(String[] args) {
        // Creating Scanner Object
        Scanner scanner = new Scanner(System.in);
        // Taking user input
        System.out.print("Enter the first number");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number");
        int num2 = scanner.nextInt();
        // Swap Function
        int num3 = num1;
        num1 = num2;
        num2 = num3;
        // Printing out the result
        System.out.printf("The swapped numbers are %d and %d", num1, num2);
    }
}