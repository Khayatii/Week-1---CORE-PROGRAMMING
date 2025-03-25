import java.util.Scanner;

public class PowerCalculator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.println("Enter the base number:");
        int number = scanner.nextInt();

        System.out.println("Enter the exponent (power):");
        int power = scanner.nextInt();

        scanner.close(); // Close scanner to avoid memory leaks

        // Ensure power is a non-negative integer
        if (power < 0) {
            System.out.println("Power must be a non-negative integer.");
            return;
        }

        int result = 1; // Initialize result to 1
        int counter = 0; // Initialize counter to 0

        // Loop until counter reaches power
        while (counter < power) {
            result *= number; // Multiply result by base number
            counter++; // Increment counter
        }

        // Print the result
        System.out.println(number + " raised to the power " + power + " is: " + result);
    }
}