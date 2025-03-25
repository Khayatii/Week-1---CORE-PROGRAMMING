import java.util.Scanner;
import static java.lang.System.*;

public class UniversityDiscount {
    public static void main(String[] args) {
        // Creating a Scanner object
        Scanner input = new Scanner(in);
        // Create a variable fee and taking user input
        out.println("Enter the Fee: ");
        double fee = input.nextDouble();
        // Taking input of discount percentage
        out.println("Enter the Discount Percentage: ");
        double discountPercentage = input.nextDouble();
        // Creating a variable for finding the totalDiscount
        double totalDiscount = fee * discountPercentage / 100;
        // Creating a variable to store the fees that needs to be paid after discount
        double feeToBePaidAfterDiscount = fee - totalDiscount;
        out.printf("The discount amount in INR %.2f and final discounted fee is INR %.2f", totalDiscount,
                feeToBePaidAfterDiscount);
        input.close();

    }
}