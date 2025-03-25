
import java.util.Scanner;

public class VowelConsonantCounter {
    public static String checkCharacterType(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonants";
            }
        } else {
            return "Not a Letter";
        }
    }

    public static int[] countVowelsAndConsonants(String input) {
        int vowels = 0;
        int consonants = 0;

        for (int i = 0;; i++) {
            try {
                char ch = input.charAt(i);
                String result = checkCharacterType(ch);
                if (result.equals("Vowel")) {
                    vowels++;
                } else if (result.equals("Consonants")) {
                    consonants++;
                }
            } catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }
        return new int[] { vowels, consonants };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        String input = scanner.nextLine();

        int[] result = countVowelsAndConsonants(input);
        System.out.println("\nVowels Count: " + result[0]);
        System.out.println("Consonants Count: " + result[1]);

        scanner.close();

    }
}
