import java.util.Scanner;

public class NumberFormatExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number (or invalid text to cause exception):");
        String input = scanner.next(); // Read user input as String

        generateException(input); // Will throw exception
        handleException(input); // Will catch and handle exception

        scanner.close(); // Close scanner to prevent resource leak
    }

    public static void generateException(String input) {
        // This will throw NumberFormatException if input is not a valid integer
        int number = Integer.parseInt(input);
        System.out.println("Converted number: " + number);
    }

    public static void handleException(String input) {
        try {
            generateException(input);
        } catch (NumberFormatException e) { // Specific exception handling
            System.out.println("Exception handled: Invalid number format! " + e);
        } catch (RuntimeException e) { // Generic exception handling
            System.out.println("A runtime exception occurred: " + e);
        }
    }
}