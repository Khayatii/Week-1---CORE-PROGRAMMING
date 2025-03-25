import java.util.Scanner;

public class something {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num < 0) {
            System.out.println("Error: Enter a natural number");
            return;
        }
        int[] oddNumbers = new int[num / 2 + 1];
        int[] evenNumbers = new int[num / 2 + 1];
        int oddIndex = 0, evenIndex = 0;

        for (int i = 0; i <= num; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex++] = i;
            } else {
                oddNumbers[oddIndex++] = i;
            }
        }
        System.out.println("Odd Numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.println(oddNumbers[i] + " ");
        }
        System.out.println();

        System.out.println("Even Numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.println(evenNumbers[i] + " ");
        }
        System.out.println();

    }
}