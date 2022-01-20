package chapterOne;

import java.util.Scanner;

public class GradeSentinel {
    public static void main(String[] args) {
//        Scanner next = new Scanner(System.in);
//        int max = 0;
//        int min = 10000;
//        double total = 0;
//        double average = 0;
//        for (int grade = 1; grade <= 10; grade++) {
//
//            System.out.println("Input score");
//            int score = next.nextInt();
//            total += score;
//            average = total / grade;
//
//            if (score > max) {
//                max = score;
//            }
//            if (score < min) {
//                min = score;
//            }
//        }
//        System.out.println(total);
//        System.out.println(average);
//        System.out.println(max);
//        System.out.println(min);
        for (int grade = 1; grade <= 10; grade++) {
            if (grade <= 1){
                System.out.println(grade);
            }
            if (grade <= 2){
                System.out.println(grade);
            }
        }
    }
}


