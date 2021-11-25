package javaChapter2;//exercise 2.17
import java.util.Scanner;
public class VariousArithmetic{
        public static void main(String[] args){
          Scanner take = new Scanner(System.in);
          System.out.println("please input a number");
            int value1 = take.nextInt();
          System.out.println("please input another number");
             int value2 = take.nextInt();
          System.out.println("please input the third number");
             int value3 = take.nextInt();
            int sumAll = value1 + value2 + value3;
            int average = (value1 + value2 + value3) / 3;
            int product = value1 * value2 * value3;
               System.out.printf("The Sum is: %d%nThe Average is: %d%nThe Product is: %d%n", sumAll, average, product);

            if(value1 < value2) { if (value1 < value3) 
            System.out.println ("The smallest number is: " + value1);}
            if(value2 < value1)  { if (value2 < value3)
            System.out.println ("The smallest number is: " + value2);}
            if(value3 < value1) { if (value3 < value2)
               System.out.println ("The smallest number is: " + value3);}
        
          if(value1 > value2) { if (value1 > value3)
             System.out.println ("The Largest number is: " + value1);}
          if(value2 > value1) { if (value2 > value3)
               System.out.println ("The Largest number is: " + value2);}
          if(value3 > value1) { if (value3 > value2)
               System.out.println ("The Largest number is: " + value3);}
         
           
}
}
