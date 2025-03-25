import java.util.Scanner;

public class CalendarDisplay {

    // Method to return the name of the month
    public static String getMonthName(int month) {
        String[] months = {
                "", "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };
        return months[month];
    }

    // Method to check for Leap Year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get the number of days in the given month
    public static int getNumberOfDaysInMonth(int month, int year) {
        int[] daysInMonth = {
                0, 31, 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31
        };
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month];
    }

    // Method to get the first day of the month using Gregorian calendar algorithm
    public static int getStartDay(int day, int month, int year) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (day + x + (31 * m0) / 12) % 7;
        return d0; // 0=Sunday, 1=Monday, ...
    }

    // Method to display the calendar
    public static void printCalendar(int month, int year) {
        int daysInMonth = getNumberOfDaysInMonth(month, year);
        int startDay = getStartDay(1, month, year); // 1st day of the month

        System.out.println("\n   " + getMonthName(month) + " " + year);
        System.out.println("Su Mo Tu We Th Fr Sa");

        // Print leading spaces
        for (int i = 0; i < startDay; i++) {
            System.out.print("   ");
        }

        // Print days of the month
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%2d ", day);
            if ((day + startDay) % 7 == 0 || day == daysInMonth) {
                System.out.println();
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        printCalendar(month, year);

        scanner.close();
    }
}