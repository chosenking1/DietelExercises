package javaChapter2.Examples;

import java.util.Scanner;

public class ScoreArray {
    public static void main(String[] args) {
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        int count;
        int average = 0;
        int total = 0;
        int inputCounter = 1;
        int [] scores =new int[10];

        for (count = 0; count < scores.length; count++) {
            System.out.println("Input Score " + inputCounter++);
            Scanner taker = new Scanner(System.in);
            int input = taker.nextInt();

            scores[count] = input;

            if (input > maximum) {
                maximum = input;
            }
            if (input < minimum) {
                minimum = input;
            }
        }

        for (int scoreIndex = 0; scoreIndex < scores.length; scoreIndex++) {
            total += scores[scoreIndex];
            average = total / count;

            System.out.print(" " + scores[scoreIndex]);

        }

        System.out.println();
        System.out.println(" The Minimum is: " + minimum + " The Maximum is: "+ maximum + " The Average is: " + average);
    }
}
