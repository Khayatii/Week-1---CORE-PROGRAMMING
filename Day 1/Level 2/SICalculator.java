import java.util.Scanner;

public class SICalculator {
    public static void main(String[] args) {
        // Creating Scanner Object
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Principle Amount");
        // Taking the user input
        double principle = scanner.nextDouble();
        System.out.println("Enter the Rate");
        double rate = scanner.nextDouble();

        System.out.println("Enter the Time");
        double time = scanner.nextDouble();

        double SI = (principle * rate * time) / 100;
        // Printing out the result
        System.out.printf("The Simple Interest is %.2f for Principal %.2f, Rate of Interest %.2f and Time %.2f\n", SI,
                principle, rate, time);

        scanner.close();
    }
}