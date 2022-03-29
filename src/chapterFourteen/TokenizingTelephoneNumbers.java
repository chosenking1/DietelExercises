package chapterFourteen;

import java.util.Arrays;
import java.util.Scanner;

public class TokenizingTelephoneNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        String[] areaCode = input.split((""), 4);

        System.out.println(Arrays.toString(areaCode));


    }


}
