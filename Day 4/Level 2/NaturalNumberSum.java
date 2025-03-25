import java.util.Scanner;

public class NaturalNumberSum {

    // Recursive method to find sum of n natural numbers
    public static int recursiveSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + recursiveSum(n - 1);
    }

    // Method using formula n*(n+1)/2
    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a natural number (positive integer): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input! Please enter a positive integer.");
        } else {
            int sumRecursive = recursiveSum(n);
            int sumFormula = formulaSum(n);

            // Display results
            System.out.println("Sum using recursion: " + sumRecursive);
            System.out.println("Sum using formula: " + sumFormula);

            // Compare results
            if (sumRecursive == sumFormula) {
                System.out.println(" Both results match. Computation is correct.");
            } else {
                System.out.println(" Results do not match. There may be an error.");
            }
        }

        scanner.close();
    }
}