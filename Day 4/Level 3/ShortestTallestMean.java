
import java.util.Scanner;

public class ShortestTallestMean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] heights = new int[11];
        for (int i = 0; i < heights.length; i++) {
            while (true) {
                System.out.println("Enter The Height of the player: " + (i + 1));
                int height = scanner.nextInt();
                if (height >= 150 && height <= 250) {
                    heights[i] = height;
                    break;
                } else {
                    System.out.println("Invalid height! Height must be between 150 and 250. Try again.");
                }
            }
        }
        System.out.println("The Sum Of The Players is : " + Sum(heights));
        Mean(heights);
        ShortestHeight(heights);
        TallestHeight(heights);

    }

    public static int Sum(int[] heights) {
        int sum = 0;
        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }
        return sum;
    }

    public static void Mean(int[] heights) {
        double mean = (double) Sum(heights) / heights.length;
        System.out.println("Mean Height: " + mean);
    }

    public static void ShortestHeight(int[] heights) {
        int smallest = heights[0];
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] < smallest) {
                smallest = heights[i];
            }
        }
        System.out.println("The Smallest Height among the players is " + smallest);
    }

    public static void TallestHeight(int[] heights) {
        int tallest = heights[0];
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] > tallest) {
                tallest = heights[i];
            }
        }
        System.out.println("The Tallest Height among the players is " + tallest);
    }

}
