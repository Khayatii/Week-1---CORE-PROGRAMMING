import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int column = scanner.nextInt();

        int[] array = new int[row * column];
        int[][] a = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
        int index = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[index++] = a[i][j];
            }
        }
        for (int num : array) {
            System.out.println(num);
        }
    }
}