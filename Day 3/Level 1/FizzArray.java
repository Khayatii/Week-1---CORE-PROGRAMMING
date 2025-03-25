import java.util.Scanner;

public class FizzArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        String[] array = new String[number];
        if (number > 0) {
            for (int i = 0; i < number; i++) {
                int value = i + 1;
                if (value % 3 == 0 && value % 5 == 0) {
                    array[i] = "FizzBuzz";
                } else if (value % 3 == 0) {
                    array[i] = "Fizz";
                } else if (value % 5 == 0) {
                    array[i] = "Buzz";
                } else {
                    array[i] = String.valueOf(value);
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}