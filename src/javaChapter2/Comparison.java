package javaChapter2;

import java.util.Scanner; //exercise 2.16
public class Comparison{
       public static void main(String[] args){
       Scanner math = new Scanner(System.in);
       System.out.print("Enter first number: ");
        int value1 = math.nextInt();
       System.out.print("Enter second number: ");
       int value2 = math.nextInt();
       if (value1 > value2){
         System.out.printf("%d is Larger", value1 );
}
        if (value1 == value2){
         System.out.print("The numbers are equal");
}     
}
}