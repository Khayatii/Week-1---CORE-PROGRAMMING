import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and populate 2D array
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightM = heightCm / 100.0;
            double bmi = weight / (heightM * heightM);
            data[i][2] = bmi;
        }
    }

    // Method to get BMI status for all persons
    public static String[] getBMIStatus(double[][] data) {
        String[] status = new String[data.length];

        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi < 25) {
                status[i] = "Normal weight";
            } else if (bmi < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        return status;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] members = new double[10][3]; // Columns: weight, height, BMI

        System.out.println("Enter weight (kg) and height (cm) for 10 members:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Member " + (i + 1) + " weight (kg): ");
            members[i][0] = scanner.nextDouble();

            System.out.print("Member " + (i + 1) + " height (cm): ");
            members[i][1] = scanner.nextDouble();
        }

        // Calculate BMI
        calculateBMI(members);

        // Get status
        String[] status = getBMIStatus(members);

        // Display result
        System.out.println("\nMember\tWeight(kg)\tHeight(cm)\tBMI\t\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t%s\n",
                    (i + 1), members[i][0], members[i][1], members[i][2], status[i]);
        }

        scanner.close();
    }
}