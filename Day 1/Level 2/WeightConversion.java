import java.util.Scanner;

public class WeightConversion {
    public static void main(String[] args) {
        // Creating Scanner object
        Scanner scanner = new Scanner(System.in);

        // Taking input
        System.out.println("Enter the weight in pounds:");
        double weightInPounds = scanner.nextDouble();

        // Conversion formula: 1 pound = 0.453592 kg
        double weightInKg = weightInPounds * 0.453592;

        // Printing the result
        System.out.printf("The weight of the person in pounds is %.2f and in kilograms is %.2f\n", weightInPounds,
                weightInKg);

        scanner.close();
    }
}