import java.util.Scanner;

public class AtheleteRunsTheTrianngle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Sides of the triangle in meters");
        // Taking user input
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();

        // Creating a variable to store the perimeter
        double perimeter = side1 + side2 + side3;

        double rounds = 5000 / perimeter;

        System.out.printf("The total number of rounds the athlete will run is %.2f to complete 5 km", rounds);

        scanner.close();
    }
}