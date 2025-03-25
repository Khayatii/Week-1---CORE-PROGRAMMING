import java.util.Scanner;

public class RemainderAndQuotient {

    // Method to find remainder and quotient
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[] { remainder, quotient };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        // Check for divide by zero
        if (divisor == 0) {
            System.out.println("Divisor cannot be zero!");
        } else {
            // Call method
            int[] result = findRemainderAndQuotient(number, divisor);

            // Display results
            System.out.println("Quotient = " + result[1]);
            System.out.println("Remainder = " + result[0]);
        }

        scanner.close();
    }
}