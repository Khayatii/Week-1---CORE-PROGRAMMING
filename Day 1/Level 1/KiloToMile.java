import java.util.Scanner;
import static java.lang.System.*;

public class KiloToMile {
    public static void main(String[] main) {
        // Create a variable km
        double kiloMeter;
        // Creating Scanner object
        Scanner input = new Scanner(System.in);
        out.println("Enter the Distance in Kilometer");
        // Taking the input of km from the user
        kiloMeter = input.nextDouble();
        double mile = kiloMeter / 1.609;
        // Printing the result
        out.printf("The total miles is %.2f mile for the given %.2f km", mile, kiloMeter);
        input.close();
    }
}