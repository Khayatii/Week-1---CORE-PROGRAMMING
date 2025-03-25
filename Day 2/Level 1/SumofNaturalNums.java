import java.util.Scanner;

public class SumofNaturalNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        int originalNum = number;
        int i = 0;
        int sum = 0;
        while (i <= number) {
            sum += i;
            i++;
        }
        System.out.println("Answer using While Loop is " + sum);

        int ansWithFormula = originalNum * (originalNum + 1) / 2;
        System.out.println("Answer using formula is " + ansWithFormula);
    }
}
