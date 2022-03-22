package assignmentsAndClassworks;

import java.util.Scanner;

public class LedLight {
    public static void main(String[] args) {
        int first;

        Scanner type = new Scanner(System.in);
        LedLight kata = new LedLight();
        String[] input = new String[7];
       for(first = 0; first < input.length; first++) {

           String keyboardInput = type.findInLine("[A-]");
        input[first] = keyboardInput;
       }

        kata.collectionIfStatement(input);

    }           
    public void collectionIfStatement(String[] input){
        int first;
        int second;
        int[][] collection = new int[5][4];
        for (first = 0; first < input.length; first++) {

            if (input[0].equals("1")) {
                for (second = 0; second < 4; second++)
                    collection[0][second] = 1;
            }
        }
        if (input[1].equals("1")) {
            for (second = 0; second < 3; second++)
                collection[second][3] = 1;
        }
        if (input[2].equals("1")) {
            for (second = 2; second < 5; second++)
                collection[second][3] = 1;
        }

        if (input[3].equals("1")) {
            for (second = 0; second < 4; second++)
                collection[4][second] = 1;
        }

        if (input[4].equals("1")) {
            for (second = 2; second < 5; second++)
                collection[second][0] = 1;
        }

        if (input[5].equals("1")) {
            for (second = 0; second < 3; second++)
                collection[second][0] = 1;
        }

        if (input[6].equals("1")) {
            for (second = 0; second < 4; second++)
                collection[2][second] = 1;
        }

        lightArray(collection);
    }

    public static void lightArray(int [][] input){
            int [][] firstArray ;
            firstArray = input;
   // return [][]firstArray;
            LedLight kata = new LedLight();

            kata.display(firstArray);
    }
    public void display(int[][] newArray) {
        // String[][] collection = new String[newArray.length][];

          for (int firstLoop = 0; firstLoop < newArray.length; firstLoop++) {
                System.out.println();
                for (int secondLoop = 0; secondLoop < newArray[firstLoop].length; secondLoop++) {

                    if(newArray[firstLoop][secondLoop] == 0)
                    System.out.print(" " + " ");
                    else System.out.print(" " + "#");
                }
          }
    }
}
