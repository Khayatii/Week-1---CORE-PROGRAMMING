import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class comparison {
   public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       String str = scanner.nextLine();

       String manuallyConverted = convertToUpperCase(str);

       String builtInUpperCase = str.toUpperCase();

       boolean isSame = compareStrings(manuallyConverted,builtInUpperCase);

       System.out.println("\n Original Text: " + str);
       System.out.println("Manually Converted: " + manuallyConverted);
       System.out.println("Built-in toUpperCase(): " + builtInUpperCase);
       System.out.println("Are both results same? " + isSame);

       scanner.close();
   }

   public static String convertToUpperCase(String str){
       StringBuilder result = new StringBuilder();

       for(int i=0; i<str.length();i++){
           char ch = str.charAt(i);
           if(ch >= 'a' && ch <='z'){
               ch = (char) (ch -32);
           }
           result.append(ch);
       }
       return result.toString();
   }
   public static boolean compareStrings(String str1, String str2){
       if(str1.length() != str2.length()){
           return false;
       }
       for(int i=0;i<str1.length();i++){
           if(str1.charAt(i) != str2.charAt(i)){
               return false;
           }
       }
       return true;
   }


}