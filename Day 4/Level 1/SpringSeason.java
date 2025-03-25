public class SpringSeason {

    // Method to check if the given month and day is in Spring Season
    public static boolean isSpringSeason(int month, int day) {
        if ((month == 3 && day >= 20 && day <= 31) || // March 20-31
                (month == 4 && day >= 1 && day <= 30) || // April
                (month == 5 && day >= 1 && day <= 31) || // May
                (month == 6 && day >= 1 && day <= 20)) { // June 1-20
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // Check if 2 arguments are passed
        if (args.length != 2) {
            System.out.println("Please provide month and day as command-line arguments.");
            return;
        }

        // Parse the input values
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Check and display result
        if (isSpringSeason(month, day)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
