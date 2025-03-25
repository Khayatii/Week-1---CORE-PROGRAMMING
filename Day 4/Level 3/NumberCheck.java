import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int number = scanner.nextInt();
        System.out.println("Total Number of Digits are:" + CountDigits(number));
        System.out.println("Array:");
        int[] digitArray = StoreDigits(number);
        for (int i = 0; i < digitArray.length; i++) {
            System.out.print(digitArray[i]);
        }
        System.out.println();
        System.out.println("Sum Of the Digits are " + SumOfDigits(StoreDigits(number)));
        SumOfSquares(StoreDigits(number));
        HarshadNumber(number, digitArray);
        int[][] frequencyTable = findDigitFrequency(number);
        System.out.println("Digit   |   Frequency");
        for (int i = 0; i < 10; i++) {
            if (frequencyTable[i][1] > 0) {
                System.out.println("   " + frequencyTable[i][0] + "    |      " + frequencyTable[i][1]);

            }
        }
        scanner.close();

    }

    public static int CountDigits(int number) {
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    public static int[] StoreDigits(int number) {
        int count = CountDigits(number);
        int[] Digits = new int[count];
        int index = Digits.length - 1;

        for (int i = index; i >= 0; i--) {
            Digits[i] = number % 10;
            number /= 10;
        }
        return Digits;
    }

    public static int SumOfDigits(int[] Digits) {
        int sum = 0;
        for (int i = 0; i < Digits.length; i++) {
            sum += Digits[i];
        }
        return sum;
    }

    public static void SumOfSquares(int[] Digits) {
        double sumOfSquares = 0;
        for (int i = 0; i < Digits.length; i++) {
            sumOfSquares += Math.pow(Digits[i], 2);
        }
        System.out.println("The Sum of Squares is " + sumOfSquares);
    }

    public static void HarshadNumber(int number, int[] digits) {
        int sumofDigits = SumOfDigits(digits);
        if (number % sumofDigits == 0) {
            System.out.println("Harshad Number");
        } else {
            System.out.println("Not a Harshad Number");
        }

    }

    public static int[][] findDigitFrequency(int number) {
        int[][] frequency = new int[10][2];
        for (int i = 0; i < frequency.length; i++) {
            frequency[i][0] = i;
            frequency[i][1] = 0;
        }
        while (number > 0) {
            int digit = number % 10;
            frequency[digit][1]++;
            number /= 10;
        }
        return frequency;

    }

}