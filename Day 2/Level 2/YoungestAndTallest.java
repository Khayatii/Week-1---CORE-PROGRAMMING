import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Ages: ");
        int ageOfFirst = scanner.nextInt();
        int ageOfSecond = scanner.nextInt();
        int ageOfThird = scanner.nextInt();

        System.out.println("Enter the heights: ");
        int heightOfFirst = scanner.nextInt();
        int heightOfSecond = scanner.nextInt();
        int heightOfThird = scanner.nextInt();

        if (ageOfFirst <= ageOfSecond && ageOfFirst <= ageOfThird) {
            System.out.println("First is Youngest");
        } else if (ageOfSecond <= ageOfFirst && ageOfSecond <= ageOfThird) {
            System.out.println("Second is Youngest");
        } else {
            System.out.println("Third is the Youngest");
        }

        if (heightOfFirst >= heightOfSecond && heightOfFirst >= heightOfThird) {
            System.out.println("First is the tallest");
        } else if (heightOfSecond >= heightOfFirst && heightOfSecond >= heightOfThird) {
            System.out.println("Second is the tallest");
        } else {
            System.out.println("Third is the tallest");
        }

    }
}