package javaChapter2;//exercise 2.32
import java.util.Scanner;
public class ValueAssignment{
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
             int less = 0;
            int less1 = 0;
            int less2 = 0;
            int less3 = 0;
            int less4 = 0;
            if(value1 < 0) {
                less = 1;
            }
            if (value2 < 0) {
                 less1 = 1;
            }
             if (value3 < 0){
                 less2 = 1;
             }
             if (value4 < 0){
                 less3= 1;
             }
            if (value5 < 0){
                less4 = 1;
            }
            int lesser = less + less1 + less2 + less3 + less4;
            System.out.printf ("We have %d negative %n", lesser);

            int high = 0;
            int high1 = 0;
            int high2 = 0;
            int high3 = 0;
            int high4 = 0;
            if(value1 > 0) {
                high = 1;
            }
            if (value2 > 0) {
                high1 = 1;
            }
            if (value3 > 0){
                high2 = 1;
            }
            if (value4 > 0){
                high3= 1;
            }
            if (value5 > 0){
                high4 = 1;
            }
            int higher = high + high1 + high2 + high3 + high4;
            System.out.printf ("We have %d Positive %n", higher);


            int not = 0;
            int not1 = 0;
            int not2 = 0;
            int not3 = 0;
            int not4 = 0;
            if(value1 == 0) {
                not = 1;
            }
            if (value2 == 0) {
                not1 = 1;
            }
            if (value3 == 0){
                not2 = 1;
            }
            if (value4 == 0){
                not3= 1;
            }
            if (value5 == 0){
                not4 = 1;
            }
            int nothing = not + not1 + not2 + not3 + not4;
            System.out.printf ("We have %d Zero's %n", nothing);
            

         
           
}
}