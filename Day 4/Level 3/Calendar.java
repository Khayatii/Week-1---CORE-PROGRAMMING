import java.util.Scanner;

public class Calendar {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       // Step 1: Get user input
       System.out.print("Enter month (1-12): ");
       int month = scanner.nextInt();
       System.out.print("Enter year: ");
       int year = scanner.nextInt();

       // Step 2: Print the calendar
       printCalendar(month, year);
   }

   // Method to print the calendar
   public static void printCalendar(int month, int year) {
       String monthName = getMonthName(month);  // Get month name
       int daysInMonth = getDaysInMonth(month, year);  // Get number of days
       int firstDay = getFirstDay(month, year);  // Get the first day of the month

       System.out.println("\n " + monthName + " " + year);
       System.out.println("Sun Mon Tue Wed Thu Fri Sat");

       // Print leading spaces for the first day
       for (int i = 0; i < firstDay; i++) {
           System.out.print("    ");
       }

       // Print all days of the month
       for (int day = 1; day <= daysInMonth; day++) {
           System.out.printf("%3d ", day);
           if ((day + firstDay) % 7 == 0) {
               System.out.println();  // New line after Saturday
           }
       }
       System.out.println();
   }

   // Step 1: Get the name of the month
   public static String getMonthName(int month) {
       String[] months = {
               "January", "February", "March", "April", "May", "June",
               "July", "August", "September", "October", "November", "December"
       };
       return months[month - 1];  // Adjust for 0-based index
   }

   // Step 2: Get number of days in the month
   public static int getDaysInMonth(int month, int year) {
       int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

       if (month == 2 && isLeapYear(year)) {
           return 29;  // February in a leap year
       }
       return daysInMonths[month - 1];  // Return days for given month
   }

   // Step 3: Check if a year is a leap year
   public static boolean isLeapYear(int year) {
       return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
   }

   // Step 4: Calculate the first day of the month using Gregorian calendar algorithm
   public static int getFirstDay(int month, int year) {
       int d = 1;  // First day of the month
       int y = year - (14 - month) / 12;
       int x = y + y / 4 - y / 100 + y / 400;
       int m = month + 12 * ((14 - month) / 12) - 2;
       return (d + x + (31 * m) / 12) % 7;  // 0 = Sunday, 1 = Monday, ..., 6 = Saturday
   }
}