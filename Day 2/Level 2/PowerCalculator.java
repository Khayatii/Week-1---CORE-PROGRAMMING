import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.println("Enter the base number:");
        int number = scanner.nextInt();

        System.out.println("Enter the exponent (power):");
        int power = scanner.nextInt();

        scanner.close(); // Close scanner to avoid resource leak

        // Ensure power is a non-negative integer
        if (power < 0) {
            System.out.println("Power must be a non-negative integer.");
            return;
        }

        int result = 1; // Initialize result to 1

        // Loop to calculate power
        for (int i = 1; i <= power; i++) {
            result *= number; // Multiply result by the base number
        }

        // Print the result
        System.out.println(number + " raised to the power " + power + " is: " + result);
    }
}