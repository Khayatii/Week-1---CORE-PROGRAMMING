import java.util.Scanner;

public class Level1ques1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Principle");
        double principle = scanner.nextDouble();
        System.out.println("Enter the Time");
        double time = scanner.nextDouble();
        System.out.println("Enter the Rate");
        double rate = scanner.nextDouble();

        simpleInterest(principle, time, rate);
        scanner.close();
    }

    public static void simpleInterest(double principle, double time, double rate) {
        double si = (principle * time * rate) / 100;
        System.out.println(si);
    }
}
