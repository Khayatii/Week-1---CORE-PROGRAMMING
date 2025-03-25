
import java.util.Scanner;

public class lengthOfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int length = input.length();
        System.out.println("In- built Function " + length);
        System.out.println("Manual Calculation ");
        System.out.println(StringLengthManually(input));
    }

    public static int StringLengthManually(String input) {
        int count = 0;
        try {
            while (true) {
                input.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {

        }
        return count;
    }
}
