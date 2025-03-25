import java.util.Scanner;

public class WindChillCalculator {

    // Method to calculate wind chill temperature
    public static double calculateWindChill(double temperature, double windSpeed) {
        double windChill = 35.74 + 0.6215 * temperature
                + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
        return windChill;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get temperature input
        System.out.print("Enter temperature in Fahrenheit: ");
        double temperature = scanner.nextDouble();

        // Get wind speed input
        System.out.print("Enter wind speed in miles per hour: ");
        double windSpeed = scanner.nextDouble();

        // Validity check (wind chill is defined for temp <= 50°F and windSpeed >= 3
        // mph)
        if (temperature <= 50 && windSpeed >= 3) {
            double result = calculateWindChill(temperature, windSpeed);
            System.out.printf("Wind Chill Temperature is: %.2f°F\n", result);
        } else {
            System.out.println("Wind chill is not defined for given values.");
            System.out.println("Temperature should be <= 50°F and wind speed >= 3 mph.");
        }

        scanner.close();
    }
}
