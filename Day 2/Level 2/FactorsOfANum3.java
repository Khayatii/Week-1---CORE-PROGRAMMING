import java.util.Scanner;

public class FactorsOfANum3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int greatestFactor = 1;
        for (int i = n - 1; i >= 1; i--) {
            if (n % i == 0) {
                System.out.println(i);
                greatestFactor = i; // Store the largest factor
                break; // Stop at the first largest factor
            }
        }
    }
}
