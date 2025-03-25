import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Two Strings ");
        String s1 = scanner.next();
        String s2 = scanner.next();

        if (Comparison(s1, s2)) {
            System.out.println("Same String");
        } else {
            System.out.println("Not same string");
        }

        if (s1.equals(s2)) {
            System.out.println("Same String");
        } else {
            System.out.println("Not Same String");
        }
    }

    public static boolean Comparison(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        int length = s1.length();
        for (int i = 0; i < length; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}