package assignmentsAndClassworks;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiArrayCollector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        int count = 0;
        ArrayList<Integer> items = new ArrayList<Integer>();
        while (input != -1) {

            System.out.println("Input a number");
            input = scanner.nextInt();

            if (input != -1) {
                items.add(input);
                count++;

            }
        }
        int totalEven = 0;
        int arrayIndex;

        for (arrayIndex = 0; arrayIndex < items.size(); arrayIndex++) {
            if (items.get(arrayIndex) % 2 == 0) {

                totalEven++;

            }
        }
        System.out.printf(" %s ", totalEven);


        int arrayListIndex;
        int maxEven =  0;
        for (arrayListIndex = 0; arrayListIndex < items.size(); arrayListIndex++) {
            if (items.get(arrayListIndex) % 2 == 0){

                maxEven = Math.max(items.get(arrayListIndex),items.get(arrayListIndex));
                totalEven++;

            }


        }
        System.out.printf(" %s", maxEven);
    }
}





//    public static int evenFinder(ArrayList<Integer> numbers) {
//        int totalEven = 0;
//        int arrayIndex;
//
//        for (arrayIndex = 0; arrayIndex < numbers.size(); arrayIndex++) {
//            if (numbers.get(arrayIndex) % 2 == 0) {
//                totalEven++;
//            }
//        }
//        return totalEven;
//    }
//
//    public static int maxEvenFinder(ArrayList<Integer> numbers) {
//        int arrayListIndex;
//        int maxEven = 0;
//        for (arrayListIndex = 0; arrayListIndex < numbers.size(); arrayListIndex++) {
//            if (numbers.get(arrayListIndex) % 2 == 0) {
//
//                maxEven = Math.max(numbers.get(arrayListIndex), numbers.get(arrayListIndex));
//            }
//        }
//        return maxEven;
//    }
//
//    public static ArrayList<Integer> input() {
//        Scanner scanner = new Scanner(System.in);
//        int input = 0;
//        int count = 0;
//        ArrayList<Integer> items = new ArrayList<Integer>();
//        while (input != -1) {
//
//            System.out.println("Input a number");
//            input = scanner.nextInt();
//
//            if (input != -1) {
//                items.add(input);
//                count++;
//
//            }
//        }
//        return items;
//    }
//}