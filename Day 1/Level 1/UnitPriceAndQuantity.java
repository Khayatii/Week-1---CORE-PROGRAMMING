import java.util.Scanner;

//Initializing a class which contains the variables
public class UnitPriceAndQuantity {
    int unitPrice;
    int quantity;

    // Creating a Constructor
    UnitPriceAndQuantity(int unitPrice, int quantity) {
        this.unitPrice = unitPrice;
        this.quantity = quantity;

    }

    // method to execute the calculation
    int calculateTotalPrice() {
        return unitPrice * quantity;
    }

    void showDetails() {
        System.out.printf("The total price in INR is %d if the quantity is %d and unit price is INR %d",
                calculateTotalPrice(), quantity, unitPrice);
    }

    // Main Function
    public static void main(String[] args) {
        int x, y;
        // Creating a Scanner
        Scanner scanner = new Scanner(System.in);
        // Taking input of Unit Price
        System.out.println("Enter the Unit Price");
        x = scanner.nextInt();
        // Taking input of Quantity
        System.out.println("Enter the Quantity");
        y = scanner.nextInt();
        // Creating an object

        UnitPriceAndQuantity UP = new UnitPriceAndQuantity(x, y);
        UP.showDetails();
        // Closing the Scanner

        scanner.close();
    }
}