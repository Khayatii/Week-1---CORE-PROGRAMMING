import java.util.Scanner;

public class LeapYearChecker {

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take year as input
        System.out.print("Enter a year (>= 1582): ");
        int year = scanner.nextInt();

        // Validate year
        if (year < 1582) {
            System.out.println("Invalid year. Gregorian calendar started in 1582.");
        } else {
            // Check and print if leap year
            if (isLeapYear(year)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is NOT a Leap Year.");
            }
        }

        scanner.close();
    }
}