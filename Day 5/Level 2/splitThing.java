import java.util.Scanner;

public class splitThing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] manualWords = manualSplit(input);
        String[] builtInWords = input.split(" ");
        boolean isSame = compareArrays(manualWords, builtInWords);

        System.out.println("\nOriginal Text: " + input);
        System.out.println("Manually Split Words: " + String.join(", ", manualWords));
        System.out.println("Built-in split() Words: " + String.join(", ", builtInWords));
        System.out.println("Are both results the same? " + isSame);

        scanner.close();

    }

    // Method to manually split text into words
    public static String[] manualSplit(String text) {
        int wordCount = countWords(text);
        String[] words = new String[wordCount];
        int start = 0, index = 0;

        for (int i = 0; i <= text.length(); i++) {
            if (i == text.length() || text.charAt(i) == ' ') {
                if (start < i) {
                    words[index++] = text.substring(start, i);
                }
                start = i + 1;
            }
        }
        return words;
    }

    public static int countWords(String text) {
        int count = 0;
        boolean isWord = false;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                if (!isWord) {
                    count++;
                    isWord = true;
                } else {
                    isWord = false;
                }
            }
        }
        return count;
    }

    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length)
            return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i]))
                return false;
        }
        return true;
    }
}