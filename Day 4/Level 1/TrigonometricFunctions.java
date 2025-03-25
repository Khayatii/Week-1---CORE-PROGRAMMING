import java.util.Scanner;

public class TrigonometricFunctions {

    // Method to calculate sine, cosine, and tangent
    public static double[] calculateTrigonometricFunctions(double angleInDegrees) {
        double radians = Math.toRadians(angleInDegrees); // Convert to radians
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        return new double[] { sine, cosine, tangent };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter angle in degrees: ");
        double angle = scanner.nextDouble();

        // Call the method
        double[] result = calculateTrigonometricFunctions(angle);

        // Display result
        System.out.printf("Sine(%.2f°) = %.4f\n", angle, result[0]);
        System.out.printf("Cosine(%.2f°) = %.4f\n", angle, result[1]);
        System.out.printf("Tangent(%.2f°) = %.4f\n", angle, result[2]);

        scanner.close();
    }
}