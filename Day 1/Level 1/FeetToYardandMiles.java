import java.util.Scanner;

public class FeetToYardandMiles {
    public static void main(String[] args) {
        // Creating Scanner Object
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the distance in Feet");
        // Taking the input from user
        float feet = scanner.nextFloat();
        // Convert feet to miles (1 mile = 5280 feet)
        int miles = (int) (feet / 5280);

        // Remaining feet after converting to miles
        float remainingFeet = feet % 5280;

        // Convert remaining feet to yards (1 yard = 3 feet)
        float yards = remainingFeet / 3;
        System.out.printf(
                "The distance in feet was %.2f and after conversion the distance in miles is %d and yards is %.2f",
                feet, miles, yards);
        scanner.close();
    }

}