import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long factorial = 1;
        int i = 1;
        if (n <= 0) {
            System.out.println("Can't be done");
            return;
        }
        while (i <= n) {
            factorial *= i;
            i++;
        }
        System.out.println(factorial);
    }
}