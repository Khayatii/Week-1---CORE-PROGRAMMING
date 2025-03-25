import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int maxDigit = 10;
        int[] digitArray = new int[maxDigit];
        int index = 0;

        while (number > 0) {
            digitArray[index] = number % 10;
            number /= 10;
            index++;

            if (index == maxDigit) {
                break;
            }
            int largest = -1;
            int secondLargest = -1;
            for (int i = 0; i < index; i++) {
                if (digitArray[i] > largest) {
                    secondLargest = largest;
                    largest = digitArray[i];
                } else if (digitArray[i] > secondLargest && digitArray[i] != largest) {
                    secondLargest = digitArray[i];
                }
            }
            System.out.println("Largest Digit :" + largest);
            System.out.println("Second Largest Digit: " + (secondLargest == 1 ? "None" : secondLargest));
        }
    }
}