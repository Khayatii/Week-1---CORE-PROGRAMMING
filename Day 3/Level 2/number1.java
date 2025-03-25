import java.util.Scanner;

public class number1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        int maxDigit = 10;
        int[] digitArray = new int[maxDigit];
        int index = 0;

        while (number > 0) {
            if (index >= maxDigit) {
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                for (int i = 0; i < digitArray.length; i++) {
                    temp[i] = digitArray[i];
                }
                digitArray = temp;
            }

            digitArray[index] = (int) number % 10;
            number /= 10;
            index++;

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
        System.out.println("Second Largest Digit: " + (secondLargest == -1 ? "None" : secondLargest));

    }
}