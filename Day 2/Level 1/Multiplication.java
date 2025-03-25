import java.util.Scanner;

public class Multiplication {
    public static void main(String[] main) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number for multiplication: ");
        int input = scanner.nextInt();
        scanner.close();

        for (int i = 6; i <= 9; i++) {
            System.out.println(input + "x" + i + " = " + (input * i));
        }
    }
}