import java.util.Scanner;

public class length2 {

    // Method to find the length of a string manually
    public static int findStringLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count); // Access characters manually
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Exception occurs when index is out of bounds, return count
        }
        return count;
    }

    // Method to split text into words manually
    public static String[] splitTextIntoWords(String text) {
        int n = findStringLength(text);
        String[] words = new String[n]; // Assume maximum words = n
        int wordCount = 0;
        String word = "";

        for (int i = 0; i < n; i++) {
            char c = text.charAt(i);
            if (c != ' ') {
                word += c;
            } else {
                if (!word.equals("")) {
                    words[wordCount++] = word;
                    word = "";
                }
            }
        }
        if (!word.equals("")) {
            words[wordCount++] = word;
        }

        // Resize array to fit actual word count
        String[] result = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
            result[i] = words[i];
        }
        return result;
    }

    // Method to generate a 2D String array of words and their lengths
    public static String[][] generateWordLengthArray(String[] words) {
        int size = words.length; // Fix: Use words.length instead of findStringLength(words)
        String[][] wordLengthArray = new String[size][2];

        for (int i = 0; i < size; i++) {
            wordLengthArray[i][0] = words[i]; // Store the word
            wordLengthArray[i][1] = String.valueOf(findStringLength(words[i])); // Store length as String
        }
        return wordLengthArray;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String inputText = scanner.nextLine();
        scanner.close();

        // Splitting text into words
        String[] words = splitTextIntoWords(inputText);

        // Generating word-length array
        String[][] wordLengthArray = generateWordLengthArray(words);

        // Display results in tabular format
        System.out.printf("%-15s %-10s\n", "Word", "Length");
        System.out.println("----------------------");
        for (String[] row : wordLengthArray) {
            System.out.printf("%-15s %-10d\n", row[0], Integer.parseInt(row[1]));
        }
    }
}