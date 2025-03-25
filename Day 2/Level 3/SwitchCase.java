import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        double first, second;
        String op;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        first = scanner.nextInt();
        System.out.println("Enter Second Number: ");
        second = scanner.nextInt();
        System.out.println("Enter Operation: ");
        op = scanner.next();
        switch (op) {
            case "+":
                System.out.println(first + second);
                break;
            case "-":
                System.out.println(first - second);
                break;
            case "/":
                System.out.println(first / second);
                break;
            case "*":
                System.out.println(first * second);
                break;
            default:
                System.out.println("Invalid Operator");
                break;
        }
    }
}