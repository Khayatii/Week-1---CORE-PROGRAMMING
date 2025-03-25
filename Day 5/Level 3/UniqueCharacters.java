import java.util.Scanner;

public class UniqueCharacters {

    // Method to calculate length of string without using length()
    public static int getLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // Reached end of string
        }
        return count;
    }

    // Method to find unique characters using charAt()
    public static char[] findUniqueCharacters(String text) {
        int len = getLength(text);
        char[] uniqueTemp = new char[len];
        int uniqueCount = 0;

        for (int i = 0; i < len; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == current) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                uniqueTemp[uniqueCount++] = current;
            }
        }

        // Create final array with only unique characters
        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = uniqueTemp[i];
        }

        return uniqueChars;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        char[] unique = findUniqueCharacters(input);
        System.out.println("\nUnique characters in the string:");
        for (char c : unique) {
            System.out.print(c + " ");
        }

        scanner.close();
    }
}