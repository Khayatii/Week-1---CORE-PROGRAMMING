import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks in Physics, Chemistry, Maths");
        float marksInPhy = sc.nextFloat();
        float marksInChe = sc.nextFloat();
        float marksInMath = sc.nextFloat();

        double percentage = ((marksInPhy + marksInChe + marksInMath) / 300) * 100;

        if (percentage >= 80) {
            System.out.println("A: Level 4, above agency-normalized standards");
        } else if (percentage <= 79 && percentage >= 70) {
            System.out.println("B: Level 3, at agency-normalized standards");
        } else if (percentage <= 69 && percentage >= 60) {
            System.out.println("C: Level 2, below, but approaching agency-normalized standards");
        } else if (percentage <= 59 && percentage >= 50) {
            System.out.println("D: Level 1, well below agency-normalized standards");
        } else if (percentage <= 49 && percentage >= 40) {
            System.out.println("E: Level 1, too below agency-normalized standards");
        } else if (percentage <= 39) {
            System.out.println("R: Remedial Standards");
        }
    }
}