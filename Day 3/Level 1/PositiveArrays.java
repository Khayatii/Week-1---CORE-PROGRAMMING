
import java.util.Scanner;

public class PositiveArrays {
    public static void main(String[] args) {
        int[] a = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                System.out.println("Positive Number: " + a[i]);
            } else if (a[i] < 0) {
                System.out.println("Negative Number: " + a[i]);
            } else {
                System.out.println("Number is Zero: " + a[i]);
            }
        }

        if (a[0] == a[4]) {
            System.out.println("Indexes are equal: " + a[0] + "= " + a[4]);
        } else if (a[0] > a[4]) {
            System.out.println("Index at 0 is greater than index at 4" + a[0] + " >" + a[4]);

        } else {
            System.out.println("Index at 4 is greater than index at 0" + a[4] + " >" + a[0]);

        }
    }

}
