package chapterFour;

import java.util.Scanner;

public class TabularOutput {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
       int factorial = 1;
        System.out.println("please enter a digit: ");
       int number = scanner.nextInt();
        if ((number == 0) || (number == 1)) {
            System.out.println(1);
        }
else{
        while (number >= 1){
        factorial *= number;
        number = number -1 ;

        System.out.print("\t\t" + factorial);}
}

    }
}
