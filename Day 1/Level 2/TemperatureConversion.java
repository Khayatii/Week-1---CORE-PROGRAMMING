import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        // Creating a variable for celsius
        double celsius;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature in Celsius: ");
        celsius = scanner.nextDouble();
        // Creating a variable for farenheit for storing the conversion
        double farenheitResult = (celsius * 9 / 5) + 32; // (°C × 9/5) + 32 = °F
        // Printing out the result
        System.out.printf("The %.2f celsius is %.2f fahrenheit", celsius, farenheitResult);

        scanner.close();
    }
}