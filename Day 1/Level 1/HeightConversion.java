import javax.swing.*;
import java.util.Scanner;

public class HeightConversion {
    public static void main(String[] args) {
        // Creating a Scanner Object
        Scanner input = new Scanner(System.in);
        // Taking height from the user
        System.out.println("Enter the height in centimeter");
        double heightCm = input.nextDouble();
        // Converting to Intermediate height
        double intermediate = heightCm / 2.54;
        // Converting to Foot
        int foot = (int) intermediate / 12;
        // Remaining height will be inches using modulo for that
        double inch = intermediate % 12;
        System.out.printf("Your Height in cm is %.2f while in feet is %d and inches is %.2f", heightCm, foot, inch);
        input.close();
    }
}