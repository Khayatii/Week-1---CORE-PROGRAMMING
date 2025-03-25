import java.util.Scanner;

public class marksOfStudentsUsingTwoDArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Number of Students");
        int numOfStudents = scanner.nextInt();

        double[] percentage = new double[numOfStudents];
        String[] grade = new String[numOfStudents];

        int[][] marks = new int[numOfStudents][3];
        for (int i = 0; i < marks.length; i++) {
            do {
                System.out.println("Enter the Maths Marks for the Student " + (i + 1));
                marks[i][0] = scanner.nextInt();
                if (marks[i][0] < 0 || marks[i][0] > 100) {
                    System.out.println("Error! Enter Valid Marks");
                    marks[i][0] = scanner.nextInt();
                }
            } while (marks[i][0] < 0 || marks[i][0] > 100);

            do {
                System.out.println("Enter the Physics Marks for the Student " + (i + 2));
                marks[i][1] = scanner.nextInt();
                if (marks[i][1] < 0 || marks[i][1] > 100) {
                    System.out.println("Error! Enter Valid Marks");
                    marks[i][1] = scanner.nextInt();
                }
            } while (marks[i][1] < 0 || marks[i][1] > 100);

            do {
                System.out.println("Enter the Chemistry Marks for the Student " + (i + 2));
                marks[i][2] = scanner.nextInt();
                if (marks[i][2] < 0 || marks[i][2] > 100) {
                    System.out.println("Error! Enter Valid Marks");
                    marks[i][1] = scanner.nextInt();
                }
            } while (marks[i][2] < 0 || marks[i][2] > 100);

            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 300.0 * 100.0;
            if (percentage[i] > 80) {
                grade[i] = "A";
            } else if (percentage[i] >= 70 && percentage[i] <= 79) {
                grade[i] = "B";
            } else if (percentage[i] >= 60 && percentage[i] <= 69) {
                grade[i] = "C";
            } else if (percentage[i] >= 50 && percentage[i] <= 59) {
                grade[i] = "D";
            } else if (percentage[i] >= 40 && percentage[i] <= 49) {
                grade[i] = "E";
            } else {
                grade[i] = "R";
            }

            System.out.println("The percentage of student" + (i + 1) + "is: " + percentage[i]);
            System.out.println("The Grade of Student :" + (i + 1) + "is: " + grade[i]);

        }
    }
}