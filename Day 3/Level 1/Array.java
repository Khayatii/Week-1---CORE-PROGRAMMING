import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
            if (a[i] <= 0) {
                System.out.println("Invalid");
            }
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 0) {
                System.out.println("The student with age" + a[i] + "can vote");
            } else if (a[i] > 0) {
                System.out.println("The student with age" + a[i] + "cannot vote");
            }
        }
    }
}