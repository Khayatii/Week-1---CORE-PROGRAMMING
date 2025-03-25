
import java.util.Scanner;

public class FactorAnalysis {

    // Method to find all factors and return as array
    public static int[] findFactors(int number) {
        int count = 0;

        // First loop to count number of factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;

        // Second loop to store factors in the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    // Method to calculate sum of factors
    public static int calculateSum(int[] factors) {
        int sum = 0;
        for (int f : factors) {
            sum += f;
        }
        return sum;
    }

    // Method to calculate product of factors
    public static long calculateProduct(int[] factors) {
        long product = 1;
        for (int f : factors) {
            product *= f;
        }
        return product;
    }

    // Method to calculate sum of square of factors
    public static double calculateSumOfSquares(int[] factors) {
        double sumSq = 0;
        for (int f : factors) {
            sumSq += Math.pow(f, 2);
        }
        return sumSq;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive number.");
        } else {
            // Get factors
            int[] factors = findFactors(number);

            // Display factors
            System.out.print("Factors of " + number + ": ");
            for (int f : factors) {
                System.out.print(f + " ");
            }
            System.out.println();

            // Calculations
            int sum = calculateSum(factors);
            long product = calculateProduct(factors);
            double sumSq = calculateSumOfSquares(factors);

            // Display results
            System.out.println("Sum of factors = " + sum);
            System.out.println("Product of factors = " + product);
            System.out.printf("Sum of squares of factors = %.2f\n", sumSq);
        }

        scanner.close();
    }
}
