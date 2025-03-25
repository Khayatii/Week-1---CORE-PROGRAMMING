import java.util.Scanner;

public class PrintOddOrEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (number == 0) {
            System.out.println("Nor Even Not odd");
        } else {
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println("The Number is Even " + i);
                } else {
                    System.out.println("The number is Odd " + i);
                }
            }
        }
    }
}