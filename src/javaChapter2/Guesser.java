package javaChapter2;

import java.util.Scanner;
public class Guesser {
        public static void main(String[] args){
           int realNumber = 8;
           Scanner take = new Scanner(System.in);
           System.out.print("Take a Number Guess: ");
          int guess = take.nextInt();
        if(guess > realNumber){
          System.out.print("Number too high");
}
        if(guess < realNumber){
          System.out.print("Number too low");
}
        if(guess == realNumber){
          System.out.print("You guessed right");
}          
}
}