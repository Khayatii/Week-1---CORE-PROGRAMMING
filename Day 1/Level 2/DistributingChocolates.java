import java.util.Scanner;

public class DistributingChocolates {
    public static void main(String[] args) {
        // Creating scanner object
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number Of Chocolates");
        // Taking user input
        int numberOfChocolates = scanner.nextInt();
        System.out.println("Enter the number of Students");
        int numberOfStudents = scanner.nextInt();
        int chocolates = numberOfChocolates / numberOfStudents;
        int remainingChocolates = numberOfChocolates % numberOfStudents;
        // Printing the result
        System.out.printf(
                "The number of chocolates each child gets is %d and the number of remaining chocolates are %d",
                chocolates, remainingChocolates);
        scanner.close();

    }
}