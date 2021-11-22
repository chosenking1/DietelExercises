package chapterOne;

import java.util.Scanner;

public class GradeSentinalWal {
    public static void main(String[] args){
    Scanner next = new Scanner(System.in);

    int max = 0;
    int min = 10000;
    double total = 0;
    double average = 0;
    int grade = 0;
    System.out.println("Input score");
    int score = next.nextInt();
        while (score != -10) {

        total += score;
        grade ++;
        if (score < min) {
                min = score;
            }
        System.out.println("Input score");
        score = next.nextInt();
        average = total / grade;

        if (score > max) {
            max = score;
        }


    }
        System.out.println(total);
        System.out.println(average);
        System.out.println(max);
        System.out.println(min);

}
}
