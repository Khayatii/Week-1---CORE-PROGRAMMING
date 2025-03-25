import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        int[] a = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Numbers for Multiplication: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(a[i] + " * " + j + " = " + a[i] * j);
            }
            System.out.println();
        }
    }
}