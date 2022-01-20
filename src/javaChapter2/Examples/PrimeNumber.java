package javaChapter2.Examples;
//collect a number
//check if the number can divide any number apart from 1 and itself
//if it can divide any other number its not prime

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("[Please input a number");
        int digit = input.nextInt();
        int divisor = 0;
        System.out.print(digit + " Factors are :");

        //        for (int counter = 1; digit % counter == 0; counter++) {
//
//          if (counter >= 2) {
//              System.out.println("Its not prime number");
//              System.out.print(counter + " ");
//          }
//          else
//              System.out.println("its  a prime");
//
//           }

        for (int counter = 1; counter <= digit; counter++) {
            if (digit % counter == 0) {
                divisor++;
            }


        }


        if(divisor == 2)

    {
        System.out.print("its a prime number");
    }

                else{
                System.out.print("its not a prime number");}

                }
}



