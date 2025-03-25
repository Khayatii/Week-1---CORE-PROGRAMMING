import java.util.Scanner;

public class NumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number");
        int number = scanner.nextInt();
        StoreDigits(number);
        DuckNumber(StoreDigits(number), number);
        ArmstrongNum(StoreDigits(number), number);
        LargestSecondLargest(StoreDigits(number));
        SmallestSecondSmallest(StoreDigits(number));

        scanner.close();

    }

    public static int countDigits(int number) {
        if (number == 0) {
            return 1;
        }
        int count = 0;
        number = Math.abs(number);
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    public static int[] StoreDigits(int number) {
        int numDigits = countDigits(number);
        int[] digits = new int[numDigits];
        int index = numDigits - 1;

        while (number > 0) {
            digits[index] = number % 10;
            number /= 10;
            index--;
        }

        return digits;
    }

    public static void DuckNumber(int[] digits, int number) {

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
            System.out.println("It is a Duck Number " + number);
        } else {
            System.out.println("Not a Duck Number " + number);
        }
    }

    public static void ArmstrongNum(int[] digits, int number) {
        int sumOfCubes = 0;
        int originalNum = number;

        for (int i = 0; i < digits.length; i++) {
            sumOfCubes += Math.pow(digits[i], 3); // Accumulate sum of cubes
        }

        if (sumOfCubes == originalNum) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }

    }

    public static void LargestSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < digits.length; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element.");
        } else {
            System.out.println("Largest: " + largest);
            System.out.println("Second Largest: " + secondLargest);
        }
    }

    public static void SmallestSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < digits.length; i++) {
            if (digits[i] < smallest) {
                secondSmallest = smallest;
                smallest = digits[i];
            } else if (digits[i] < secondSmallest && digits[i] != smallest) {
                secondSmallest = digits[i];
            }

        }
        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("There is no second Smallest");
        } else {
            System.out.println("Smallest Number is " + smallest);
            System.out.println("Second Smallest Number is " + secondSmallest);
        }
    }

}