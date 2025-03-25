import java.util.Scanner;

public class FactorsOfANum4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n > 0 && n <= 100) {
            int i = 100;
            while (i >= 1) {
                if (n % i == 0) {
                    System.out.println(i);
                }
                i--;
            }
        }
    }
}