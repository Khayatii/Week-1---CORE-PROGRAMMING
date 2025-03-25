import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        // Creating Scanner Object
        Scanner scanner = new Scanner(System.in);
        // Creating variables a,b,c of int type
        int a, b, c;
        // Taking input from the user
        System.out.print("Enter the first number");
        a = scanner.nextInt();
        System.out.print("Enter the second number");
        b = scanner.nextInt();
        System.out.print("Enter the third number");
        c = scanner.nextInt();
        // Creating variables for the operations
        int op1 = a + b * c;
        int op2 = a * b + c;
        int op3 = c + a / b;
        int op4 = a % b + c;

        // Printing out the result
        System.out.printf("The results of Int Operations are %d , %d , %d , %d", op1, op2, op3, op4);
        scanner.close();

    }
}