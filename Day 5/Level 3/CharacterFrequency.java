import java.util.Scanner;

public class CharacterFrequency {

    // Method to find the frequency of characters and return as 2D array
    public static String[][] findCharacterFrequencies(String text) {
        int[] freq = new int[256]; // For ASCII character frequency

        // Count frequency of each character using charAt()
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        // Count number of unique characters for 2D array size
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                uniqueCount++;
            }
        }

        // Create a 2D array to store character and frequency
        String[][] result = new String[uniqueCount][2];
        int index = 0;

        // Fill the 2D array
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[index][0] = Character.toString((char) i);
                result[index][1] = Integer.toString(freq[i]);
                index++;
            }
        }

        return result;
    }

    // Display the 2D array in tabular form
    public static void displayFrequencies(String[][] frequencies) {
        System.out.println("Character | Frequency");
        System.out.println("----------------------");
        for (String[] entry : frequencies) {
            System.out.println("    " + entry[0] + "     |     " + entry[1]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[][] frequencies = findCharacterFrequencies(input);

        displayFrequencies(frequencies);

        scanner.close();
    }
}