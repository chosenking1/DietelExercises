package chapterFourteen;

import java.util.Scanner;

public class PalindromeAdvance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        StringBuilder swap = new StringBuilder(input);
        System.out.println(swap.reverse());

        if(input.equals(swap.toString())){
            System.out.println("its a palindrume");
        }

    }
}
