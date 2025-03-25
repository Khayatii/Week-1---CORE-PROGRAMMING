import java.util.Scanner;

public class NumberC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");

        int number = scanner.nextInt();
        number = Math.abs(number);
        PrintFactors(number, Factors(number));
        GreatestFactor(Factors(number));
        PrintSumOfFactor(number, Factors(number));
        ProductOfFactors(Factors(number));
        CubeOfFactors(Factors(number));
        PerfectNumber(number, Factors(number));
        AbundantNumber(number, Factors(number));
        DeficientNumber(number, Factors(number));
        StrongNumber(number);

    }

    public static int[] Factors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    public static void PrintFactors(int number, int[] Factors) {
        System.out.println("Factors Of " + number + " are ");
        for (int i = 0; i < Factors.length; i++) {
            System.out.println(Factors[i]);
        }
        System.out.println();
    }

    public static void GreatestFactor(int[] Factors) {
        int greatestFactor = Factors[0];
        System.out.println("The Greatest Factor is: ");
        for (int i = 0; i < Factors.length - 1; i++) {
            if (Factors[i] > greatestFactor) {
                greatestFactor = Factors[i];
            }
        }
        System.out.println(greatestFactor);
    }

    public static void PrintSumOfFactor(int number, int[] Factors) {
        int sum = 0;
        for (int i = 0; i < Factors.length; i++) {
            sum += Factors[i];
        }
        System.out.println("The sum of the factors of  " + number);
        System.out.println(sum);
    }

    public static void ProductOfFactors(int[] Factors) {
        int product = 1;
        for (int i = 0; i < Factors.length; i++) {
            product *= Factors[i];
        }
        System.out.println(product);
    }

    public static void CubeOfFactors(int[] Factors) {
        long product = 1;
        for (int factors : Factors) {
            product *= Math.pow(factors, 3);
        }
        System.out.println("Product Of Cube");
        System.out.println(product);
    }

    public static void PerfectNumber(int number, int[] Factors) {
        int sum = 0;
        for (int i = 0; i < Factors.length - 1; i++) {
            sum += Factors[i];
        }

        if (sum == number) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not a Perfect Number");
        }

    }

    public static void AbundantNumber(int number, int[] Factors) {
        int sum = 0;
        for (int i = 0; i < Factors.length - 1; i++) {
            sum += Factors[i];
        }

        if (sum > number) {
            System.out.println("Abundant Number");
        } else {
            System.out.println("Not an Abundant Number");
        }

    }

    public static void DeficientNumber(int number, int[] Factors) {
        int sum = 0;
        for (int i = 0; i < Factors.length - 1; i++) {
            sum += Factors[i];
        }

        if (sum < number) {
            System.out.println("Deficient Number");
        } else {
            System.out.println("Not a Deficient Number");
        }

    }

    public static void StrongNumber(int number) {
        int originalNumber = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10; // Get last digit
            sum += factorial(digit); // Add factorial of digit to sum
            number /= 10; // Remove last digit
        }

        if (sum == originalNumber) {
            System.out.println(originalNumber + " is a Strong Number.");
        } else {
            System.out.println(originalNumber + " is NOT a Strong Number.");
        }
    }

    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}