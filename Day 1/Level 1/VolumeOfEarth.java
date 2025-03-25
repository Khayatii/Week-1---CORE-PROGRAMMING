import static java.lang.Math.*;

public class VolumeOfEarth {
    public static void main(String[] args) {
        // Creating a variable to store the radius of earth
        double radius = 6371.0;
        // Creating a variable to store the volume of earth
        double volume = (4.0 / 3.0) * PI * pow(radius, 3);
        // Creating a variable to store the volume in miles as well
        double milesVolume = volume * 0.239913;
        // Printing the output
        System.out.printf("The volume of earth in cubic kilometers is %.2f and cubic miles is %.2f ", volume,
                milesVolume);
    }
}
