
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count = 0;
        int temp = Math.abs(number);
        while (temp > 0) {
            temp /= 10;
            count++;
        }
        if (count == 0)
            count = 1;
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            int digit = number % 10;
            array[i] = digit;
            number /= 10;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
