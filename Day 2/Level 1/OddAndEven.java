import java.sql.SQLOutput;
import java.util.Scanner;

public class OddAndEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (input == 0) {
            System.out.println("Nor Even nor Odd");
        } else {
            for (int i = 1; i <= input; i++) {
                if (i % 2 == 0) {
                    System.out.println("The Number is Even: " + i);
                } else {
                    System.out.println("The Number is Odd: " + i);
                }
            }
        }
    }
}