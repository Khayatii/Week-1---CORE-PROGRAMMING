import java.util.Scanner;

public class multiplevalues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] a = new double[10];
        double total = 0.0;
        int index = 0;
        while (true) {
            System.out.println("Enter a number : ");
            double num = scanner.nextDouble();

            if (num <= 0) {
                break;
            }
            a[index] = num;
            index++;

            if (index == 10) {
                System.out.println("Array limit reached");
                break;
            }
            for (int i = 0; i < index; i++) {
                System.out.println(a[i] + " ");
                total += a[i];
            }
            System.out.println(total);
        }
    }
}