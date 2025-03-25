import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;

        while (true) {
            System.out.println("Enter 0 to stop: ");
            double num = scanner.nextDouble();
            if (num == 0) {
                System.out.println("Number entered is zero");
                break;
            } else {
                total += num;
            }
        }
        System.out.println("total sum" + total);

    }
}