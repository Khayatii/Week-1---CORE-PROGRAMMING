import java.util.Scanner;

public class BasicCalculator {
   public static void main(String[] args){
       //Creating a Scanner Object
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the First Number");
       //Taking input of the first number
       float num1 = input.nextFloat();
       System.out.println("Enter the Second Number");
       //Taking input of the second number
       float num2 = input.nextFloat();
       //Performing Arithmetic Operations
       float add = num1+ num2;
       float sub = num1 - num2;
       float mul = num1 *num2;
       float div = num1/num2;
       //Printing out the result
       System.out.printf("The addition, subtraction, multiplication and division value of 2 numbers %.2f and %.2f is %.2f , %.2f , %.2f and %.2f", num1, num2, add, sub,mul,div );
       input.close();

   }
}