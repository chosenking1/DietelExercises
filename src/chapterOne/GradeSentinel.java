package chapterOne;

import java.util.Scanner;

public class GradeSentinel {
    public static void main(String[] args) {
        Scanner next = new Scanner(System.in);

        int max = 0;
        int min = 10000;
        double total = 0;
        double average = 0;

        System.out.println("Input score");
        int score = next.nextInt();

        for ( int grade = 1; ; grade++) {
            if (score == 10){
                break;
            }else {
                System.out.println("Input score");
                score = next.nextInt();
            }



            total += score;
            average = total / grade;

            if (score > max) {
                max = score;
            }
            if (score < min) {
                min = score;
            }

        }
        System.out.println(total);
        System.out.println(average);
        System.out.println(max);
        System.out.println(min);

    }

}
