import java.util.Scanner;

public class UniqueCharacterFrequency {

    // Method to find unique characters using charAt()
    public static char[] findUniqueCharacters(String text) {
        int len = text.length();
        char[] uniqueChars = new char[len];
        int uniqueIndex = 0;

        for (int i = 0; i < len; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                uniqueChars[uniqueIndex++] = currentChar;
            }
        }

        // Trim array to size of unique characters
        char[] result = new char[uniqueIndex];
        for (int i = 0; i < uniqueIndex; i++) {
            result[i] = uniqueChars[i];
        }
        return result;
    }

    // Method to find frequencies of unique characters
    public static String[][] findFrequencies(String text) {
        int[] freq = new int[256]; // ASCII-based frequency counter

        // Count frequency using charAt
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        // Get unique characters
        char[] unique = findUniqueCharacters(text);
        String[][] result = new String[unique.length][2];

        // Store character and frequency
        for (int i = 0; i < unique.length; i++) {
            result[i][0] = Character.toString(unique[i]);
            result[i][1] = Integer.toString(freq[unique[i]]);
        }

        return result;
    }

    // Display method
    public static void displayFrequencies(String[][] freq) {
        System.out.println("Character | Frequency");
        System.out.println("----------------------");
        for (String[] row : freq) {
            System.out.println("    " + row[0] + "     |     " + row[1]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[][] frequencyTable = findFrequencies(input);
        displayFrequencies(frequencyTable);

        scanner.close();
    }
}