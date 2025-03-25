import java.util.Scanner;

public class SumofNaturalNums1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        scanner.close();
        int originalNum = number;
        int sum = 0;
        for (int i = 0; i <= number; i++) {
            sum += i;
        }
        System.out.println("Answer using While Loop is " + sum);

        int ansWithFormula = originalNum * (originalNum + 1) / 2;
        System.out.println("Answer using formula is " + ansWithFormula);
    }
}