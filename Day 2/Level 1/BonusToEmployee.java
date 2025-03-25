import java.util.Scanner;

public class BonusToEmployee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Salary: ");
        double salary = scanner.nextDouble();
        System.out.println("Enter the year of Service: ");
        double yearsOfService = scanner.nextDouble();
        scanner.close();

        double bonus = salary * 5 / 100.0;

        if (yearsOfService >= 5) {
            System.out.println("Your Updates salary is:" + (salary + bonus));
        } else {
            System.out.println("You are not eligible for a bonus");
        }
    }
}