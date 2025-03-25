import java.util.Scanner;

public class MaxHandshakes {
    public static void main(String[] args) {
        // Creating a Scanner Object
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number Of Students: ");
        // Taking input from the user
        int numberOfStudents = scanner.nextInt();
        // Calculation
        int maxHandShakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        // Printing out the result
        System.out.print("The maximum number of handshakes are " + maxHandShakes);
        scanner.close();
    }
}
