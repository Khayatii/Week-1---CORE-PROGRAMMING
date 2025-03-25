import java.sql.SQLOutput;
import java.util.Scanner;

public class TravelComputation {
    public static void main(String[] args) {
        // Creating variable and taking user input
        String name, fromCity, viaCity, toCity;
        // Creating Scanner Object
        Scanner scanner = new Scanner(System.in);
        // Taking input from the user of name, from city , to city , via city
        System.out.println("Enter the Name: ");
        name = scanner.nextLine();
        System.out.println("Enter the fromCity");
        fromCity = scanner.nextLine();
        System.out.println("Enter the viaCity");
        viaCity = scanner.nextLine();
        System.out.println("Enter the toCity");
        toCity = scanner.nextLine();

        // Taking input from the user of the distance between the cities

        System.out.println("Enter distance to Via City");
        double ToVia = scanner.nextDouble();

        System.out.println("Enter the distance from via to final city");
        double viaToFinalCity = scanner.nextDouble();

        System.out.println("Enter the travel time to Via City");
        double ToViaTravelTime = scanner.nextDouble();

        System.out.println("Enter the travel time from Via City to Final City");
        double ToFinalCityTime = scanner.nextDouble();

        // Converting hours to minutes

        double totalTime = ToViaTravelTime + ToFinalCityTime;
        int totalTimeinmins = (int) (totalTime * 60);

        double totalDistance = ToVia + viaToFinalCity;

        // Printing out the result

        System.out.println("The Total Distance travelled by " + name + " from " +
                fromCity + " to " + toCity + " via " + viaCity +
                " is " + totalDistance + " miles and " +
                "the Total Time taken is " + totalTimeinmins + " minutes");

        scanner.close();
    }
}
