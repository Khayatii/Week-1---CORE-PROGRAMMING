
import java.util.Scanner;

public class Quadratic {

    public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[] { root1, root2 };
        } else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[] { root };
        } else {
            // No real roots
            return new double[0];
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter value of b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter value of c: ");
        double c = scanner.nextDouble();

        if (a == 0) {
            System.out.println("This is not a quadratic equation (a cannot be 0).");
        } else {
            double[] roots = findRoots(a, b, c);

            if (roots.length == 2) {
                System.out.printf("Two real roots: x = %.2f and x = %.2f\n", roots[0], roots[1]);
            } else if (roots.length == 1) {
                System.out.printf("One real root: x = %.2f\n", roots[0]);
            } else {
                System.out.println("No real roots (delta is negative).");
            }
        }

        scanner.close();
    }
}
