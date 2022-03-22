package chapterFour;

import java.util.Scanner;

//4.21
public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = 0;
        int min = 10000;
        double total = 0;
        double average = 0;
        int grade = 0;
        //System.out.println("Input Unit Sold");
        int score = 0;
        while (score != -10) {

            total += score;
            grade++;

            System.out.println("Input Unit Sold");
            score = scanner.nextInt();


            if (score > max) {
                max = score;
            }

        }
        System.out.println(max);
    }
}