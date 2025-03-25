import java.util.Scanner;

public class ChocolateDistribution {

    // Method to calculate quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[] { quotient, remainder };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();

        System.out.print("Enter number of children: ");
        int numberOfChildren = scanner.nextInt();

        // Check for valid input
        if (numberOfChildren == 0) {
            System.out.println("Number of children cannot be zero!");
        } else {
            // Call the method
            int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

            // Display result
            System.out.println("Each child gets " + result[0] + " chocolates.");
            System.out.println("Remaining chocolates: " + result[1]);
        }

        scanner.close();
    }
}