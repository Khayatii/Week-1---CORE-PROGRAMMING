import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Positive Number");
        int number = scanner.nextInt();
        scanner.close();
        if (number <= 0) {
            System.out.println("Not Possible");
            return;
        } else {
            for (int i = 1; i <= number; i++)
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
        }

    }
}