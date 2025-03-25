
import java.util.Scanner;

public class StringIndexOutOfBound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = scanner.next();

        // generateException(str);
        handleException(str);

    }

    public static void generateException(String str) {
        char c = str.charAt(str.length());
    }

    public static void handleException(String str) {
        try {
            generateException(str);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

}
