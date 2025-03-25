import java.util.Scanner;
import java.lang.Math.*;

class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int originalNum = sc.nextInt();
        int num = originalNum;
        int sum = 0;
        int length = 0;

        for (int i = num; i > 0; i /= 10) {
            length++;
        }

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, length);
            num /= 10;
        }

        if (sum == originalNum) {
            System.out.println("The Number is Armstrong");
        } else {
            System.out.println("The Number is not Armstrong");
        }
    }
}