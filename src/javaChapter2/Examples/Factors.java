package javaChapter2.Examples;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner type = new Scanner(System.in);
        System.out.println("Write any number");
        int num = type.nextInt();
        int count = 0;
        System.out.print(num + " Factors are :");
        for (int counter = 1;  counter <= num; counter++) {
            if (num % counter == 0)
            {
      count ++;
      System.out.print(counter + " ");
 }
        }
        System.out.println();
        System.out.println("Total Factors are: " + count);
        }
    }
