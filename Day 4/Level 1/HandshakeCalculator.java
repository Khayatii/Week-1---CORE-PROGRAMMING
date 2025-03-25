import java.util.Scanner;

public class HandshakeCalculator {

    // Method to calculate handshakes using the formula
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        try {
            int n = scanner.nextInt();

            if (n < 0) {
                System.out.println("Number of students can't be negative.");
            } else {
                int handshakes = calculateHandshakes(n);
                System.out.println("Maximum number of handshakes among " + n + " students is: " + handshakes);
            }
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }
}
