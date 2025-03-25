
import java.util.Scanner;

public class FactorsOfANum1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 1;
        while (i <= n) {
            if (n % i == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
