import java.util.Scanner;

public class NaturalNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        if (number > 0) {
            int ans = (number * (number + 1) / 2);
            System.out.printf("The sum of %d natural numbers is %d", number, ans);
        } else {
            System.out.println("The number is not a natural number");
        }
        scanner.close();
    }
}
