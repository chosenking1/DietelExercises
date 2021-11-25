package javaChapter2;

import java.util.Scanner; //exercise 2.15
public class Arithmetic{
       public static void main(String[] args){
       Scanner math = new Scanner(System.in);
       System.out.print("Enter first number: ");
        int value1 = math.nextInt();
       System.out.print("Enter second number: ");
       int value2 = math.nextInt();
       int sum = value1 + value2;
       int product = value1 * value2;
       int difference = value1 - value2;
       int quotient = value1 / value2;
       System.out.printf(" The Sum is: %d%n The Product is: %d%n The Difference is: %d%n The Quotient is: %d%n", sum,product,difference,quotient);
}
}