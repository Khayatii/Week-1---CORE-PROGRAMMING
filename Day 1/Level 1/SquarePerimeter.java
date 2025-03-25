import java.util.Scanner;

public class SquarePerimeter {
    public static void main(String[] args) {
        // Creating a Scanner Object
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Perimeter of the Square");
        // Taking input of perimeter from the user
        float perimeter = scanner.nextFloat();
        // Creating a variable for side
        float side = perimeter / 4.0F;
        // Printing the result
        System.out.printf("The length of the side is %.2f whose perimeter is %.2f", side, perimeter);
        scanner.close();
    }
}