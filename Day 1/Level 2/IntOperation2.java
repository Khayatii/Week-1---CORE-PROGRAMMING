import java.util.Scanner;

public class IntOperation2 {
    public static void main(String[] args) {
        // Creating Scanner Object
        Scanner scanner = new Scanner(System.in);
        // Creating variables a,b,c of double type
        double a, b, c;
        // Taking input from the user
        System.out.print("Enter the first number");
        a = scanner.nextDouble();
        System.out.print("Enter the second number");
        b = scanner.nextDouble();
        System.out.print("Enter the third number");
        c = scanner.nextDouble();
        // Creating variables for the operations
        double op1 = a + b * c;
        double op2 = a * b + c;
        double op3 = c + a / b;
        double op4 = a % b + c;

        // Printing out the result
        System.out.printf("The results of Int Operations are %.2f , %.2f , %.2f , %.2f", op1, op2, op3, op4);
        scanner.close();

    }
}
