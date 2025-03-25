import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        scanner.close(); // Close scanner to prevent resource leak

        int greatestFactor = 1; // Initialize with the smallest possible factor
        int counter = number - 1; // Start from the last possible factor

        while (counter >= 1) { // Loop till counter reaches 1
            if (number % counter == 0) { // Check if 'counter' is a factor
                greatestFactor = counter; // Store the greatest factor
                break; // Stop at the first largest factor
            }
            counter--; // Decrement counter
        }

        System.out.println("Greatest factor besides itself: " + greatestFactor);
    }
}