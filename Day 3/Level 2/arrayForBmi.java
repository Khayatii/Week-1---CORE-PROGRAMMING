import java.util.Scanner;

public class arrayForBmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A Number: ");
        int number = scanner.nextInt();
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            do {
                System.out.println("Enter the Weight for person : " + (i + 1));
                personData[i][0] = scanner.nextDouble();
                if (personData[i][0] <= 0) {
                    System.out.println("Enter Valid Weight");
                }
            } while (personData[i][0] <= 0);

            do {
                System.out.println("Enter the height for person : " + (i + 1));
                personData[i][1] = scanner.nextDouble();
                if (personData[i][1] <= 0) {
                    System.out.println("Enter Valid height");
                }
            } while (personData[i][1] <= 0);

            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);

            // Assigning weight status based on BMI
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] < 24.9) {
                weightStatus[i] = "Normal Weight";
            } else if (personData[i][2] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Displaying results
        System.out.println("\nBMI Report:");
        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            System.out.printf("Weight: %.2f kg%n", personData[i][0]);
            System.out.printf("Height: %.2f m%n", personData[i][1]);
            System.out.printf("BMI: %.2f%n", personData[i][2]);
            System.out.println("Status: " + weightStatus[i]);
        }
    }
}