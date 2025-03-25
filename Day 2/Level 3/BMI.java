import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Weight: ");
        double weight = sc.nextDouble();
        System.out.println("Enter You height (in cms): ");
        double height = sc.nextDouble();
        double heightTometer = height / 100;
        double BMI = weight / (heightTometer * heightTometer);
        System.out.printf("You BMI is %.2f", BMI);
    }
}