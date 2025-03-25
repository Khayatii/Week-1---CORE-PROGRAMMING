import java.util.Scanner;

public class NumberCheckk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Number of Digits are " + countOfDigits(number));
        StoreDigit(number);
        ReverseArray(StoreDigit(number));
        int[] digitArray = StoreDigit(number); // Store digits array once
        int[] reversedArray = ReverseArray(digitArray); // Get reversed array

        ArrayEqual(digitArray, reversedArray);
        DuckNumber(StoreDigit(number));
    }

    public static int countOfDigits(int number) {
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    public static int[] StoreDigit(int number) {
        int totalCount = countOfDigits(number);
        int[] digits = new int[totalCount];
        int index = digits.length - 1;

        for (int i = index; i >= 0; i--) {
            int digit = number % 10;
            digits[i] = digit;
            number /= 10;
        }

        return digits;
    }

    public static int[] ReverseArray(int[] digits) {
        int[] reversedArray = new int[digits.length];
        int index = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            reversedArray[index++] = digits[i];
        }
        return reversedArray;
    }

    public static void ArrayEqual(int[] digits, int[] reversedArray) {
        boolean isEqual = false;
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == reversedArray[i]) {
                isEqual = true;
            } else {
                isEqual = false;
            }
        }
        if (isEqual) {
            System.out.println("The Arrays Are Equal");
        } else {
            System.out.println("The Arrays Are Not Equal");
        }
    }

    public static void DuckNumber(int[] digits) {
        boolean isDuck = false;
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == 0) {
                isDuck = true;
                break;
            } else {
                isDuck = false;
            }
        }
        if (isDuck) {
            System.out.println("Number is Duck");
        } else {
            System.out.println("Number is Not Duck");
        }
    }
}