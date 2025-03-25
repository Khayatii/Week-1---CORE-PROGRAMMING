import java.util.Scanner;

public class LeapYear2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking user Input
        System.out.println("Enter The Year");
        int year = sc.nextInt();
        sc.close();

        if (year >= 1582) { // Acc to Georgian Calendar
            if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                System.out.println("Leap");
            } else {
                System.out.println("Not leap");
            }

        }
    }
}