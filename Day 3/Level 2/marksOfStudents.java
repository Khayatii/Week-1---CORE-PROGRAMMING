import java.util.Scanner;

public class marksOfStudents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number of Students");
        int number = scanner.nextInt();
        int[] marksInPhysics = new int[number];
        int[] marksInChe = new int[number];
        int[] marksInMaths = new int[number];

        double[] percentage = new double[number];
        String[] grade = new String[number];

        for (int i = 0; i < marksInMaths.length; i++) {
            do {
                System.out.println("Enter Marks in Maths for Student " + (i + 1));
                marksInMaths[i] = scanner.nextInt();
                if (marksInMaths[i] < 0 || marksInMaths[i] > 100) {
                    System.out.println("Enter Valid Marks");
                }
            } while (marksInMaths[i] < 0 || marksInMaths[i] > 100);

            do {
                System.out.println("Enter Marks in Physics for Student " + (i + 1));
                marksInPhysics[i] = scanner.nextInt();
                if (marksInPhysics[i] < 0 || marksInPhysics[i] > 100) {
                    System.out.println("Enter Valid Marks");
                }
            } while (marksInPhysics[i] < 0 || marksInPhysics[i] > 100);

            do {
                System.out.println("Enter Marks in Chemistry for Student " + (i + 1));
                marksInChe[i] = scanner.nextInt();
                if (marksInChe[i] < 0 || marksInChe[i] > 100) {
                    System.out.println("Enter Valid Marks");
                }
            } while (marksInChe[i] < 0 || marksInChe[i] > 100);

            percentage[i] = ((marksInChe[i] + marksInMaths[i] + marksInPhysics[i]) / 300.0) * 100;
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