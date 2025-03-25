import java.util.Scanner;

public class argument {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        // generateException(str);

        handleException(str);

    }

    public static void generateException(String str) {
        String str2 = str.substring(5, 2);
        System.out.println(str2);
    }

    public static void handleException(String str) {
        try {
            generateException(str);
        } catch (java.lang.IllegalArgumentException e) {
            System.out.println("exception handled" + e);
        } catch (RuntimeException e) { // Generic exception handling
            System.out.println("A runtime exception occurred: " + e);
        }
    }
}