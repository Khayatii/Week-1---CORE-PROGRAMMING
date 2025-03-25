import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        // Creating a Scanner Object
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Base of Triangle");
        // Taking Input From the user of base of the triangle
        float base = scanner.nextFloat();

        System.out.println("Enter the height of the Triangle");
        // Taking input from the user of the height of the triangle
        float height = scanner.nextFloat();

        // Creating new variable and saving the result of area of triangle in it
        float areaInCm = (1.0F / 2.0F) * base * height;
        // Creating new variable and converting the area in sqaure cm to square inches
        float areaIninch = areaInCm / (2.54F * 2.54F);

        // Printing the result
        System.out.printf("The area of the triangle in square inches and square centimeters is %.2f and %.2f ",
                areaIninch, areaInCm);

        scanner.close();

    }
}