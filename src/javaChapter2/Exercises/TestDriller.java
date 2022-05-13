package javaChapter2.Exercises;
//We first write a code that takes an input, then we and then we write conditions
//that assigns different multiplications to the input arcording to the number imputed, 
//so therefore, as the numbers increases the figure they are multiplied by decreases.
import java.util.Scanner;
public class TestDriller{
public static void main(String[] args){
Scanner store = new Scanner(System.in);
System.out.println("please Enter the Quantity you need");
         int quantity = store.nextInt();

            if(quantity <= 4) 
            { if (quantity >= 1) 
            
            System.out.println ("The price is " + 2000 * quantity);}
           
            if(quantity <= 9) 
            { if (quantity >= 5) 
            
            System.out.println ("The price is " + 1800 * quantity);}

            if(quantity <= 29) 
            { if (quantity >= 10) 
            
            System.out.println ("The price is " + 1600 * quantity);}

            if(quantity <= 49) 
            { if (quantity >= 30) 
            
            System.out.println ("The price is " + 1500 * quantity);}

            if(quantity <= 99) 
            { if (quantity >= 50) 
            
            System.out.println ("The price is " + 1300 * quantity);}

            if(quantity <= 199) 
            { if (quantity >= 100) 
            
            System.out.println ("The price is " + 1200 * quantity);}

            if(quantity <= 499) 
            { if (quantity >= 200) 
            
            System.out.println ("The price is " + 1100 * quantity);}

            if(quantity >= 500) 
            {
            
            System.out.println ("The price is " + 1000 * quantity);}
            
            
}
}