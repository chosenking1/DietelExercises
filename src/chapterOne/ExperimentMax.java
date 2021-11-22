package chapterOne;

import java.util.Scanner;

public class ExperimentMax {
    public static void main(String[] args) {
        Scanner next = new Scanner(System.in);

        int max = 0;
        int min = 100;
        int old = 0;

        double total = 0;
        double average = 0;

        for (int grade = 1; grade <= 10; grade++) {



            System.out.println("Input score");
          int  score = next.nextInt();
            old = score;
            total += score;
            average = total / grade;
            max = score;

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
