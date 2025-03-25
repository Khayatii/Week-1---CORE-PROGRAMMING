import java.util.Scanner;

public class TemperaturConversion {
    public static void main(String[] args) {
        // Creating a variable fahrenheit and taking user input in it
        double fahrenheit;
        // Creating a Scanner Object
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature: ");
        fahrenheit = scanner.nextDouble();
        // Creating a variable celsiusResult for storing the result of conversion
        double celsiusResult = (fahrenheit - 32) * 5 / 9; // (°F − 32) x 5/9 = °C
        // Print out the result
        System.out.printf("The %.2f fahrenheit is %.2f celsius", fahrenheit, celsiusResult);
        scanner.close();
    }
}