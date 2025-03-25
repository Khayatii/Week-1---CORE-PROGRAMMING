public class Salary {
    public static void main(String[] args) {
        int[][] employees = new int[10][2]; // Stores salary and years of service

        // Step 1: Generate salaries and years of service
        for (int i = 0; i < employees.length; i++) {
            employees[i][0] = generateSalary();
            employees[i][1] = generateYearsOfService();
        }

        // Step 2: Calculate new salaries and bonuses
        int[][] updatedSalaries = calculateNewSalaries(employees);

        // Step 3: Display results
        displayResults(employees, updatedSalaries);
    }

    public static int generateSalary() {
        return 100000 + (int) (Math.random() * 900000);
    }

    public static int generateYearsOfService() {
        return 1 + (int) (Math.random() * 10);
    }

    public static int[][] calculateNewSalaries(int[][] employees) {
        int[][] newSalaryBonus = new int[10][2];

        for (int i = 0; i < employees.length; i++) {
            int oldSalary = employees[i][0];
            int years = employees[i][1];
            int bonus = (years > 5) ? (oldSalary * 5 / 100) : (oldSalary * 2 / 100);
            int newSalary = oldSalary + bonus;

            newSalaryBonus[i][0] = newSalary; // New salary after bonus
            newSalaryBonus[i][1] = bonus; // Store bonus separately
        }
        return newSalaryBonus;
    }

    public static void displayResults(int[][] employees, int[][] updatedSalaries) {
        System.out.println("----------------------------------------------------------");
        System.out.printf("%-10s %-15s %-15s %-15s %-15s\n",
                "Emp ID", "Old Salary", "Years Service", "Bonus", "New Salary");
        System.out.println("----------------------------------------------------------");

        for (int i = 0; i < employees.length; i++) {
            System.out.printf("%-10d %-15d %-15d %-15d %-15d\n",
                    (i + 1), employees[i][0], employees[i][1], updatedSalaries[i][1], updatedSalaries[i][0]);
        }
    }
}