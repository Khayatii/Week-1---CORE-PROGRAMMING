import java.util.Scanner;

public class PalindromeChecker {

    // Logic 1: Using start and end index comparison
    public static boolean isPalindromeLogic1(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive comparison of characters
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3: Using character arrays and reversal
    public static boolean isPalindromeLogic3(String text) {
        char[] original = text.toCharArray();
        char[] reversed = reverseText(text);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }

    // Method to reverse text using charAt
    public static char[] reverseText(String text) {
        char[] reversed = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            reversed[i] = text.charAt(text.length() - 1 - i);
        }
        return reversed;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text to check for palindrome: ");
        String input = scanner.nextLine();

        // Optional: Normalize input (uncomment if ignoring case and spaces)
        // input = input.replaceAll("\\s+", "").toLowerCase();

        System.out.println("\nChecking Palindrome Using Different Logics:");

        boolean result1 = isPalindromeLogic1(input);
        System.out.println("Logic 1 (Start/End Comparison): " + result1);

        boolean result2 = isPalindromeRecursive(input, 0, input.length() - 1);
        System.out.println("Logic 2 (Recursive): " + result2);

        boolean result3 = isPalindromeLogic3(input);
        System.out.println("Logic 3 (Char Arrays): " + result3);

        scanner.close();
    }
}