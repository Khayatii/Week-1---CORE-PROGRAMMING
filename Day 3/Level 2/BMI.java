import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of Persons");

        int numberOfPeople = scanner.nextInt();

        int[] weight = new int[numberOfPeople];
        double[] height = new double[numberOfPeople];
        double[] bmiValues = new double[numberOfPeople];
        String[] weightStatus = new String[numberOfPeople];

        for (int i = 0; i < weight.length; i++) {
            System.out.println("Enter the Weight of " + (i + 1) + " Person(in kg):");
            weight[i] = scanner.nextInt();
            System.out.println("Enter the Height of " + (i + 1) + " Person (in meters)");
            height[i] = scanner.nextDouble();

            bmiValues[i] = (double) weight[i] / (height[i] * height[i]);
        }

        for (int i = 0; i < bmiValues.length; i++) {
            if (bmiValues[i] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmiValues[i] >= 18.5 && bmiValues[i] <= 24.9) {
                weightStatus[i] = "Normal Weight";
            } else if (bmiValues[i] >= 25.0 && bmiValues[i] <= 29.9) {
                weightStatus[i] = "Overweight";
            } else if (bmiValues[i] >= 30.0) {
                weightStatus[i] = "Obese";
            }
        }

        for (int i = 0; i < weight.length; i++) {
            System.out.println("The weight of the person " + (i + 1) + "is:" + weight[i]);
            System.out.println("The Height of the peron " + (i + 1) + "is: " + height[i]);
            System.out.printf("The BMI of the person " + (i + 1) + "is: %.2f", bmiValues[i]);
            System.out.println();
            System.out.println("The Overall status of the person " + (i + 1) + "is: " + weightStatus[i]);
        }

        scanner.close();

    }
}