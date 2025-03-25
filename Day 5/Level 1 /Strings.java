import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking inputs from the user
        System.out.println("Enter a String: ");
        String str = scanner.next();

        System.out.println("Enter The Start Index: ");
        int start = scanner.nextInt();

        System.out.println("Enter The End Index: ");
        int end = scanner.nextInt();

        // Get results from both methods
        String result1 = compareString(start, end, str);
        String result2 = subString(start, end, str);

        // Print results
        System.out.println("\nUsing charAt(): " + result1);
        System.out.println("Using substring(): " + result2);

        // Compare the two results
        if (result1.equals(result2)) {
            System.out.println("Both methods produce the same result.");
        } else {
            System.out.println("The results are different.");
        }

        scanner.close();
    }

    // Updated method to return a string instead of void
    public static String compareString(int start, int end, String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end; i++) { // No need for `end + 1`
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    // Updated method to return the substring directly
    public static String subString(int start, int end, String str) {
        return str.substring(start, end); // No need for `end + 1`
    }
}