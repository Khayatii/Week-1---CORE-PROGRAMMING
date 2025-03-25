import java.util.Scanner;

public class Collinear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for three points
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();
        System.out.print("Enter x3: ");
        double x3 = scanner.nextDouble();
        System.out.print("Enter y3: ");
        double y3 = scanner.nextDouble();

        // Check collinearity using slope method
        boolean isCollinearSlope = checkCollinearUsingSlope(x1, y1, x2, y2, x3, y3);

        // Check collinearity using area method
        boolean isCollinearArea = checkCollinearUsingArea(x1, y1, x2, y2, x3, y3);

        // Display results
        if (isCollinearSlope && isCollinearArea) {
            System.out.println("The points are collinear.");
        } else {
            System.out.println("The points are NOT collinear.");
        }

        scanner.close();
    }

    // Method to check collinearity using the slope formula
    public static boolean checkCollinearUsingSlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);

        return (slopeAB == slopeBC) && (slopeBC == slopeAC);
    }

    // Method to check collinearity using the area of triangle formula
    public static boolean checkCollinearUsingArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }
}