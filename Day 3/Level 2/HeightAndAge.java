import java.util.Scanner;

public class HeightAndAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] age = new int[3];
        int[] height = new int[3];

        for (int i = 0; i < age.length; i++) {
            System.out.println("Enter the age of the" + (i + 1) + "person");
            age[i] = scanner.nextInt();

            while (age[i] < 0) {
                System.out.println("Invalid Age");
                age[i] = scanner.nextInt();
            }

            System.out.println("Enter the height of the" + (i + 1) + "person");
            height[i] = scanner.nextInt();

            while (height[i] < 0) {
                System.out.println("Invalid Height");
                height[i] = scanner.nextInt();
            }
        }
        int youngest = age[0];
        for (int i = 0; i < age.length; i++) {
            if (age[i] < youngest) {
                youngest = age[i];
            }

        }

        int tallest = height[0];
        for (int i = 0; i < height.length; i++) {
            if (height[i] > tallest) {
                tallest = height[i];
            }
        }

        System.out.println("The Youngest is: " + youngest);
        System.out.println("The Tallest is: " + tallest);

    }
}