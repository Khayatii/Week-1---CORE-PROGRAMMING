public class UniversityFeeDiscount {
    public static void main(String[] args) {
        // Create a variable fee and assign 125000 to it
        int fee = 125000;
        // Discount Percentage
        int discountPercentage = 10;
        // Creating a variable for finding the totalDiscount
        int totalDiscount = fee * discountPercentage / 100;
        // Creating a variable to store the fees that needs to be paid after discount
        int feeToBePaidAfterDiscount = fee - totalDiscount;
        System.out.printf("The discount amount in INR %d and final discounted fee is INR %d", totalDiscount,
                feeToBePaidAfterDiscount);
    }
}