package assignmentsAndClassworks;

import java.util.Scanner;

//# pig latin in chapter 14
public class PigLatin {
    public static void main(String[] args) {
        System.out.println("Enter a sentence");
        Scanner scanner = new Scanner(System.in);
        String[] sentence = scanner.nextLine().split(" ");
        StringBuilder pigLatinSentence = new StringBuilder();

        for(String word : sentence){
            pigLatinSentence.append(printLatinWord(word)).append(" ");
        }
    }

    public static String printLatinWord(String word){
        StringBuilder result = new StringBuilder(word);
        Character character = result.charAt(0);
        result.insert(result.length(), character);
        result.append("ay");

return result.substring(1);
    }
}
