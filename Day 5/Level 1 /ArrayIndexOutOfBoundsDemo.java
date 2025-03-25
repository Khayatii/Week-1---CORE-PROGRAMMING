import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define an array of names
        String[] names = { "Alice", "Bob", "Charlie", "David", "Emma" };

        // Ask the user to input an index
        System.out.println("Enter an index to access the name (0 to 4, or out of bounds to cause exception):");
        int index = scanner.nextInt();

        generateException(names, index); // Will throw exception
        handleException(names, index); // Will catch and handle exception

        scanner.close(); // Close scanner to prevent memory leak
    }

    public static void generateException(String[] names, int index) {
        // This will throw ArrayIndexOutOfBoundsException if index is invalid
        System.out.println("Accessing element at index " + index + ": " + names[index]);
    }

    public static void handleException(String[] names, int index) {
        try {
            generateException(names, index);
        } catch (ArrayIndexOutOfBoundsException e) { // Specific exception handling
            System.out.println("Exception handled: Invalid array index! " + e);
        } catch (RuntimeException e) { // Generic exception handling
            System.out.println("A runtime exception occurred: " + e);
        }
    }
}