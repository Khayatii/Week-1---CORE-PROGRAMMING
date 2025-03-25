public class ProfitandLoss {
    public static void main(String[] args) {
        // Saving the value of costPrice and sellingPrice into variables
        double costPrice = 129, sellingPrice = 191;
        // initialising the variable profit
        // Subtracting costPrice from sellingPrice gives us the profit
        double profit = sellingPrice - costPrice;
        // Creating a variable to store the profit percentage
        double profitPercentage = profit / costPrice * 100;
        // Printing the output
        System.out.printf("The Cost Price is INR %.2f and Selling Price is INR %.2f \n " +
                "The Profit is INR %.2f and the Profit Percentage is %.2f", costPrice, sellingPrice, profit,
                profitPercentage);
    }
}