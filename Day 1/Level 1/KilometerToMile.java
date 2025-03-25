public class KilometerToMile {
    public static void main(String[] args) {
        // Distance in kilometer is saved in a variable
        double kilometer = 10.8;
        // Converting the kilometer to miles and saving it in miles variable
        double miles = kilometer / 1.60934;
        // Printing the miles
        System.out.printf("The distance %.2f km in miles is %.2f", kilometer, miles);
    }
}