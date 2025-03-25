import java.util.Random;
import java.util.Scanner;

public class StudentScoreCard {

    // Generate random 2-digit marks for Physics, Chemistry, Math
    public static int[][] generateRandomScores(int numberOfStudents) {
        int[][] scores = new int[numberOfStudents][3];
        Random random = new Random();

        for (int i = 0; i < numberOfStudents; i++) {
            scores[i][0] = random.nextInt(41) + 60; // Physics: 60 to 100
            scores[i][1] = random.nextInt(41) + 60; // Chemistry: 60 to 100
            scores[i][2] = random.nextInt(41) + 60; // Math: 60 to 100
        }
        return scores;
    }

    // Calculate total, average, and percentage
    public static double[][] calculatePerformance(int[][] scores) {
        int n = scores.length;
        double[][] performance = new double[n][3]; // [total, average, percentage]

        for (int i = 0; i < n; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;

            // Round to 2 decimal places
            performance[i][0] = total;
            performance[i][1] = Math.round(avg * 100.0) / 100.0;
            performance[i][2] = Math.round(percent * 100.0) / 100.0;
        }

        return performance;
    }

    // Determine grade based on percentage
    public static String[] assignGrades(double[][] performance) {
        String[] grades = new String[performance.length];

        for (int i = 0; i < performance.length; i++) {
            double percent = performance[i][2];

            if (percent >= 90)
                grades[i] = "A+";
            else if (percent >= 80)
                grades[i] = "A";
            else if (percent >= 70)
                grades[i] = "B";
            else if (percent >= 60)
                grades[i] = "C";
            else if (percent >= 50)
                grades[i] = "D";
            else
                grades[i] = "F";
        }
        return grades;
    }

    // Display the full scorecard
    public static void displayScoreCard(int[][] scores, double[][] performance, String[] grades) {
        System.out.println("\nScorecard:");
        System.out.println("---------------------------------------------------------------");
        System.out.println("S.No\tPhysics\tChemistry\tMath\tTotal\tAvg\t\t% \tGrade");
        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%d\t%.2f\t%.2f\t%s\n",
                    (i + 1), scores[i][0], scores[i][1], scores[i][2],
                    (int) performance[i][0], performance[i][1], performance[i][2], grades[i]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] scores = generateRandomScores(n);
        double[][] performance = calculatePerformance(scores);
        String[] grades = assignGrades(performance);

        displayScoreCard(scores, performance, grades);
    }
}