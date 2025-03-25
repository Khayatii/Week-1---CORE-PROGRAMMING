import java.util.Scanner;

public class ManualTrim {

    // Method to find the start and end indexes (after removing leading/trailing
    // spaces)
    public static int[] findTrimIndexes(String input) {
        int start = 0;
        int end = 0;

        // Find string length manually
        try {
            while (true) {
                input.charAt(end);
                end++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Length found
        }

        // Trim leading spaces
        while (start < end && input.charAt(start) == ' ') {
            start++;
        }

        // Trim trailing spaces
        int last = end - 1;
        while (last >= start && input.charAt(last) == ' ') {
            last--;
        }

        return new int[] { start, last }; // Return start and end (inclusive)
    }

    // Method to extract substring using charAt()
    public static String manualSubstring(String input, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += input.charAt(i);
        }
        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
        int len1 = 0, len2 = 0;

        try {
            while (true)
                s1.charAt(len1++);
        } catch (StringIndexOutOfBoundsException e) {
        }

        try {
            while (true)
                s2.charAt(len2++);
        } catch (StringIndexOutOfBoundsException e) {
        }

        if (len1 != len2)
            return false;

        for (int i = 0; i < len1; i++) {
            if (s1.charAt(i) != s2.charAt(i))
                return false;
        }

        return true;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a string with leading and trailing spaces: ");
        String input = scanner.nextLine();

        // Manual trim
        int[] indexes = findTrimIndexes(input);
        String manuallyTrimmed = manualSubstring(input, indexes[0], indexes[1]);

        // Built-in trim
        String builtinTrimmed = input.trim();

        // Compare results
        boolean areEqual = compareStrings(manuallyTrimmed, builtinTrimmed);

        // Output
        System.out.println("\nManually Trimmed String: \"" + manuallyTrimmed + "\"");
        System.out.println("Built-in Trimmed String: \"" + builtinTrimmed + "\"");
        System.out.println("Are both equal? " + (areEqual ? "Yes " : "No "));

        scanner.close();
    }
}