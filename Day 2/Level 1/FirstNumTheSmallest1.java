import java.util.Scanner;
import java.lang.System;

public class FirstNumTheSmallest1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Taking user input
        System.out.print("Enter the first number");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number");
        int num3 = scanner.nextInt();

        boolean isSmallest;

        if (num1 <= num2 && num1 <= num3) {
            isSmallest = true;
        } else {
            isSmallest = false;
        }

        System.out.println("Is the first number the smallest: ?" + isSmallest);
    }
}