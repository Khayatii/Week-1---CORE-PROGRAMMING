import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number Of Students");
        int numberOfStudents = scanner.nextInt();
        int[][] marksOfStudents = new int[numberOfStudents][3];
        for (int i = 0; i < numberOfStudents; i++) {
            marksOfStudents[i][0] = generatePhysicsMarks();
            marksOfStudents[i][1] = generateChemistryMarks();
            marksOfStudents[i][2] = generateMathsMarks();
        }

        int[][] forDisplay = totalOfNumbers(numberOfStudents, marksOfStudents);
        DisplayScoreCard(forDisplay);
    }

    public static int generatePhysicsMarks() {
        return (int) (1 + Math.random() * 100);
    }

    public static int generateChemistryMarks() {
        return (int) (1 + Math.random() * 100);
    }

    public static int generateMathsMarks() {
        return (int) (1 + Math.random() * 100);
    }

    public static int[][] totalOfNumbers(int numberOfStudents, int[][] marksOfStudents) {
        int[][] totalmarks = new int[numberOfStudents][3];
        for (int i = 0; i < marksOfStudents.length; i++) {
            totalmarks[i][0] = marksOfStudents[i][0] + marksOfStudents[i][1] + marksOfStudents[i][2];
            totalmarks[i][1] = totalmarks[i][0] / 3;
            totalmarks[i][2] = (totalmarks[i][0] * 100) / 300;
        }
        return totalmarks;
    }

    public static void DisplayScoreCard(int[][] totalmarks) {
        System.out.println("----------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-10s \n", "S. No", "Total Marks", "Average", "Percentage");
        System.out.println("----------------------------------------------");

        for (int i = 0; i < totalmarks.length; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d \n",
                    (i + 1), // Serial number
                    totalmarks[i][0], // Total marks
                    totalmarks[i][1], // Average
                    totalmarks[i][2] // Percentage
            );
        }
    }
}