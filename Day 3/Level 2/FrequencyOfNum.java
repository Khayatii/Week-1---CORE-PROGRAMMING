import java.util.Scanner;

public class FrequencyOfNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int[] frequency = new int[10];
        int temp = Math.abs(number); // To handle negative numbers
        while (temp > 0) {
            int digit = temp % 10; // Get the last digit
            frequency[digit]++; // Increment its count
            temp /= 10; // Remove the last digit
        }
        // Step 4: Display the frequency of each digit
        System.out.println("Digit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " appears " + frequency[i] + " times");
            }
        }
    }
}