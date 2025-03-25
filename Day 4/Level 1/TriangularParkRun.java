import java.util.Scanner;

public class TriangularParkRun {

    // Method to calculate number of rounds required to complete 5 km
    public static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double distanceInMeters = 5000; // 5 km = 5000 meters
        return distanceInMeters / perimeter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for 3 sides of the triangular park
        System.out.print("Enter length of side 1 (in meters): ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter length of side 2 (in meters): ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter length of side 3 (in meters): ");
        double side3 = scanner.nextDouble();

        // Calculate and display the number of rounds
        double rounds = calculateRounds(side1, side2, side3);
        System.out.printf("The athlete must complete %.2f rounds to run 5 km.\n", rounds);

        scanner.close();
    }
}