import java.util.Scanner;

public class characters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String ");
        String str = scanner.next();

        char[] Arr = str.toCharArray();
        if (isEqual(stringArray(str), Arr, str)) {
            System.out.println("The Strings are Equal");
        } else {
            System.out.println("The Strings are not Equal");
        }

    }

    public static char[] stringArray(String str) {
        char[] array = new char[str.length()];
        for (int i = 0; i < str.length(); i++)
            array[i] = str.charAt(i);

        return array;
    }

    public static boolean isEqual(char[] array, char[] Array, String str) {
        for (int i = 0; i < str.length(); i++) {
            if (array[i] != Array[i]) {
                return false;
            }
        }
        return true;
    }
}