package assignmentsAndClassworks;

import java.util.stream.IntStream;

public class ReverseOfWord {
    public static void main(String[] args) {

        String word = "Balloon";
        for(int i = word.length() -1; i >= 0; i--){
            System.out.print(""+word.charAt(i));
        }

    }
}
