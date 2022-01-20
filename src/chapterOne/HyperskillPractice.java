package chapterOne;

import java.util.Scanner;

public class HyperskillPractice {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        // put your code here
//        int collector =0;
//        int count =0;
//        int maximum = Integer.MIN_VALUE;
//        int minimum = Integer.MAX_VALUE;
//        int h =maximum;
//        int a =0;
//        int b =minimum;
//        int mainCounter = 0;
//        int input= 0;
//        while(input >= 0 && mainCounter == 3){
//            mainCounter++;
//            input = scanner.nextInt();
//            if (input > maximum) {
//                maximum = input;
//                if (input < minimum) {
//                    minimum = input;
//                }
//                else a = input;
//            }
//
//        }
//        while(collector <= h){
//            collector += a - b;
//        count++;
//
//        }
//
//    }

}

//import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int d = 0;
        int a = 0;
        int c = 0;
        int b = 0;
        int count = 0;
        int input = 0;
        char ch = 65;
        System.out.println(ch);
        int _cat$6 = 5%2;
        System.out.println(_cat$6);
        while(count < 14) {

            input = scanner.nextInt();


            if (input == 5) {
                a++;
            }


            if (input == 4) {
                b++;
            }


            if (input == 3) {
                c++;
            }

            if (input == 2) {
                d++;
            }
            count++;
        }
        System.out.println();
        System.out.print(d+" "+ c +" "+b+" "+a);
    }
}


