import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI
    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0; // convert cm to meters
        return weight / (heightM * heightM);
    }

    // Method to determine BMI status
    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5)
            return "Underweight";
        else if (bmi < 24.9)
            return "Normal";
        else if (bmi < 29.9)
            return "Overweight";
        else
            return "Obese";
    }

    // Method to compute BMI and status for all members
    public static String[][] computeBMIResults(double[][] data) {
        String[][] results = new String[10][4]; // height, weight, BMI, status

        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double height = data[i][1];
            double bmi = calculateBMI(weight, height);
            String status = getBMIStatus(bmi);

            results[i][0] = String.format("%.2f", height);
            results[i][1] = String.format("%.2f", weight);
            results[i][2] = String.format("%.2f", bmi);
            results[i][3] = status;
        }

        return results;
    }

    // Method to display the results in a table
    public static void displayResults(String[][] results) {
        System.out.println("Person\tHeight(cm)\tWeight(kg)\tBMI\t\tStatus");
        for (int i = 0; i < results.length; i++) {
            System.out.printf("%d\t%s\t\t%s\t\t%s\t%s\n",
                    (i + 1), results[i][0], results[i][1], results[i][2], results[i][3]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] personData = new double[10][2]; // [weight, height]

        System.out.println("Enter the weight (kg) and height (cm) of 10 people:");

        for (int i = 0; i < 10; i++) {
            System.out.printf("Person %d:\n", i + 1);
            System.out.print("Weight (kg): ");
            personData[i][0] = scanner.nextDouble();
            System.out.print("Height (cm): ");
            personData[i][1] = scanner.nextDouble();
        }

        String[][] bmiResults = computeBMIResults(personData);
        System.out.println("\n--- BMI Report ---");
        displayResults(bmiResults);

        scanner.close();
    }
}