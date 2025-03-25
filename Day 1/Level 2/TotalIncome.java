import java.util.Scanner;

public class TotalIncome {
    public static void main(String[] args) {
        // Creating a scanner object
        Scanner scanner = new Scanner(System.in);
        // Taking user input of salary and bonus
        System.out.print("Enter the Salary: ");
        double salary = scanner.nextDouble();
        System.out.print("Enter the Bonus: ");
        double bonus = scanner.nextDouble();
        // Printing out the result
        System.out.printf(
                " The salary is INR %.2f and bonus is INR %.2f. Hence Total Income is INR " + (salary + bonus), salary,
                bonus);
        scanner.close();
    }
}