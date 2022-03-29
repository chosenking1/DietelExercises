package assignmentsAndClassworks;

import java.util.Objects;
import java.util.Scanner;

public class HowManyTimesAWordCanBeExtracted {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] check = {"b","a", "l", "l","o","o","n"};
        String input = scanner.nextLine();
        int number = 0;
        int count= 0;
        String result = input.toLowerCase();
        String[] deserialize = result.split("()\\s*");

        for(int i = 0; i < deserialize.length; i++){
            count++;
            if(count == check.length){
                count = 0;
            }

            if(result.contains(check[count])){
                number += 1;
                System.out.println(number);

            }
        }

        int total = number / 7;

        System.out.println(total);
    }

}
