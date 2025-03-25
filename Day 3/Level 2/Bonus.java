import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];

        for (int i = 0; i < salary.length; i++) {
            System.out.println("Enter salary for employee : " + (i + 1));
            salary[i] = scanner.nextDouble();

            while (salary[i] < 0) {
                System.out.println("Error! Salary can't be less than zero");
                salary[i] = scanner.nextDouble();
            }
            System.out.println("Enter year of service for Employee: " + (i + 1));
            yearsOfService[i] = scanner.nextDouble();

            while (yearsOfService[i] < 0) {
                System.out.println("Invalid years of Service");
                yearsOfService[i] = scanner.nextDouble();
            }
        }
        double[] bonus = new double[10];
        for (int i = 0; i < salary.length; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = (salary[i] * 0.05);
            } else {
                bonus[i] = (salary[i] * 0.02);
            }
        }

        double[] newSalary = new double[10];
        for (int i = 0; i < salary.length; i++) {
            newSalary[i] = salary[i] + bonus[i];
        }
        double totalBonus = 0;
        for (int i = 0; i < bonus.length; i++) {
            totalBonus += bonus[i];
        }

        double totalOldSalary = 0;
        for (int i = 0; i < salary.length; i++) {
            totalOldSalary += salary[i];
        }

        double totalNewSalary = 0;
        for (int i = 0; i < newSalary.length; i++) {
            totalNewSalary += newSalary[i];
        }
        System.out.println("The Total Bonus of the Employee is : " + totalBonus);
        System.out.println("The Total Old Salary of the Employee is : " + totalOldSalary);
        System.out.println("The Total New salary of the employee is : " + totalNewSalary);

        scanner.close();

    }
}