import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;

        // for(int i=num;i>0;i/=10){
        // count ++;

        while (num > 0) {
            num /= 10;
            count++;
        }
        System.out.println(count);
    }
}