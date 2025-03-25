import java.util.Scanner;

public class PrintQuotientReminder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number for division: ");
        // Taking input of the first number
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number division: ");
        // Taking input of second number
        int num2 = scanner.nextInt();

        int quo = num1 / num2;
        int rem = num1 % num2;
        System.out.printf("The Quotient is %d and Reminder is %d of two number %d and %d", quo, rem, num1, num2);
        scanner.close();
    }
}
