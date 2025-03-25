import java.util.Scanner;

public class DivisibleBy5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number");
        int number = scanner.nextInt();
        boolean isDivisible;

        if (number % 5 == 0) {
            isDivisible = true;

        } else {
            isDivisible = false;
        }

        System.out.printf("Is the number %d divisible by 5: " + isDivisible, number);
        scanner.close();
    }
}