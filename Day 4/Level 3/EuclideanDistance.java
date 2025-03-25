import java.util.Scanner;

public class EuclideanDistance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for two points
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();

        // Calculate and print Euclidean distance
        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean Distance: %.2f\n", distance);

        // Calculate equation of the line
        double[] lineEquation = findEquation(x1, y1, x2, y2);
        System.out.printf("Equation of the Line: y = %.2fx + %.2f\n", lineEquation[0], lineEquation[1]);
    }

    // Method to calculate Euclidean distance
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method to calculate slope and y-intercept
    public static double[] findEquation(double x1, double y1, double x2, double y2) {
        double m = (y2 - y1) / (x2 - x1); // Calculate slope
        double b = y1 - (m * x1); // Calculate y-intercept

        return new double[] { m, b }; // Return array containing slope and intercept
    }
}