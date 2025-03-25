import java.util.Scanner;

public class RocketLaunch1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        for (int i = number; i >= 0; i--) {
            System.out.println(i);
        }
    }
}