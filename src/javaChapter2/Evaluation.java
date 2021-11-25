package javaChapter2;//exercise 2.24
import java.util.Scanner;
public class Evaluation{
        public static void main(String[] args){
          Scanner take = new Scanner(System.in);
          System.out.println("please input a number");
            int value1 = take.nextInt();
          System.out.println("please input another number");
             int value2 = take.nextInt();
          System.out.println("please input the Third number");
             int value3 = take.nextInt();
          System.out.println("Please input the Fourth number");
             int value4 = take.nextInt();
          System.out.println("Please input the Fifth");
             int value5 = take.nextInt();
               
            if(value1 < value2) 
            { if (value1 < value3) 
            { if (value1 < value4)
            { if (value1 < value5)
            System.out.println ("The smallest number is: " + value1);}}}
            
             if(value2 < value1)  
            { if (value2 < value3)
            { if (value2 < value4)
            { if (value2 < value5)
            System.out.println ("The smallest number is: " + value2);}}}

            if(value3 < value1) 
            { if (value3 < value2)
            { if (value3 < value4)
            { if (value3 < value5)
               System.out.println ("The smallest number is: " + value3);}}}
            
            if(value4 < value1) 
            { if (value4 < value2)
            { if (value4 < value3)
            { if (value4 < value5)
               System.out.println ("The smallest number is: " + value4);}}}

            
            if(value5 < value1) 
            { if (value5 < value2)
            { if (value5 < value3)
            { if (value5 < value4)
               System.out.println ("The smallest number is: " + value5);}}}
        
          


          if(value1 > value2) 
          { if (value1 > value3)
          { if (value1 > value4)
          { if (value1 > value5)
             System.out.println ("The Largest number is: " + value1);}}}

          if(value2 > value1) 
          { if (value2 > value3)
          { if (value2 > value4)
          { if (value2 > value5)
               System.out.println ("The Largest number is: " + value2);}}}

          if(value3 > value1) 
          { if (value3 > value2)
          { if (value3 > value4)
          { if (value3 > value5)
               System.out.println ("The Largest number is: " + value3);}}}

          if(value4 > value1) 
          { if (value4 > value2)
          { if (value4 > value3)
          { if (value4 > value5)
               System.out.println ("The Largest number is: " + value4);}}}

          if(value5 > value1) 
          { if (value5 > value2)
          { if (value5 > value3)
          { if (value5 > value4)
               System.out.println ("The Largest number is: " + value5);}}}
         
           
}
}