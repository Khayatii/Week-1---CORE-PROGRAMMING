import java.util.Scanner;

public class StudentVoteChecker {

    // Method to check if a student can vote
    public static boolean canStudentVote(int age) {
        if (age < 0) {
            return false; // Invalid age
        } else if (age >= 18) {
            return true; // Eligible to vote
        } else {
            return false; // Not eligible
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ages = new int[10]; // Array to store ages of 10 students

        // Taking input for 10 students
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
        }

        System.out.println("\nVoting Eligibility Results:");
        for (int i = 0; i < 10; i++) {
            boolean canVote = canStudentVote(ages[i]);
            if (ages[i] < 0) {
                System.out.println("Student " + (i + 1) + ": Invalid age entered.");
            } else if (canVote) {
                System.out.println("Student " + (i + 1) + " (Age: " + ages[i] + "): Eligible to vote.");
            } else {
                System.out.println("Student " + (i + 1) + " (Age: " + ages[i] + "): Not eligible to vote.");
            }
        }

        scanner.close();
    }
}