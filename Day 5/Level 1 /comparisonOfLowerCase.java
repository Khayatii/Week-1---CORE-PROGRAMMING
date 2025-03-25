import java.util.Scanner;

public class comparisonOfLowerCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        // Convert text to lowercase manually
        String manuallyConverted = convertToLowerCase(input);

        // Convert text using built-in toLowerCase()
        String builtInLowerCase = input.toLowerCase();

        // Compare both results
        boolean isSame = isSame(manuallyConverted, builtInLowerCase);

        // Print results
        System.out.println("\nOriginal Text: " + input);
        System.out.println("Manually Converted: " + manuallyConverted);
        System.out.println("Built-in toLowerCase(): " + builtInLowerCase);
        System.out.println("Are both results the same? " + isSame);

        scanner.close();
    }

    public static String convertToLowerCase(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32); // Convert uppercase to lowercase
            }
            result.append(ch);
        }
        return result.toString();
    }

    public static boolean isSame(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}