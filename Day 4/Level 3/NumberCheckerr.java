import java.util.Scanner;

public class NumberCheckerr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A Number");
        int number = scanner.nextInt();
        PrimeCheck(number);
        NeonNumber(number);
        SpyNumber(number);
        AutomorphicNumber(number);
        BuzzNumber(number);

    }

    public static void PrimeCheck(int number) {
        boolean isPrime = true;
        if (number == 1 || number == 0) {
            return;
        }

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println("Number is Prime");
        } else {
            System.out.println("Number is not Prime");
        }
    }

    public static void NeonNumber(int number) {
        int square = (int) Math.pow(number, 2);
        int sumofDigits = 0;
        while (square > 0) {
            sumofDigits += square % 10;
            square /= 10;
        }

        if (sumofDigits == number) {
            System.out.println("Neon Number");
        } else {
            System.out.println("Not A Neon Number");
        }
    }

    public static void SpyNumber(int number) {
        int temp = number; // Store original number
        int sumOfDigits = 0, productOfDigits = 1;

        while (temp > 0) {
            int digit = temp % 10;
            sumOfDigits += digit;
            productOfDigits *= digit;
            temp /= 10;
        }

        System.out.println("Sum of Digits: " + sumOfDigits);
        System.out.println("Product of Digits: " + productOfDigits);

        if (sumOfDigits == productOfDigits) {
            System.out.println(number + " is a Spy Number");
        } else {
            System.out.println(number + " is NOT a Spy Number");
        }
    }

    public static void AutomorphicNumber(int number) {
        int temp = number;
        int square = number * number;
        boolean isAutomorphic = true;
        while (temp > 0) {
            if (temp % 10 != square % 10) {
                isAutomorphic = false;
            }
            temp /= 10;
            square /= 10;
        }

        if (isAutomorphic) {
            System.out.println("It is a automorphic number");
        } else {
            System.out.println("Is is not an automorphic number");
        }
    }

    public static void BuzzNumber(int number) {
        if (number % 7 == 0 || number % 10 == 7) {
            System.out.println("The Number is a Buzz Number");
        } else {
            System.out.println("The Number is not a Buzz Number");
        }
    }
}