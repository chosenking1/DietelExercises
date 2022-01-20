package javaChapter2;

public class ArrayMaxAndMin {
    public static int[][] multiDimensionalOfCollection(int[] numbers){
        int total = 0 ;
        int subtract;
        int index;
        int newTotal;

        int [][] collection = new int[2][];
        int [] totalArray = new int[numbers.length];
        collection[0] = numbers;

        for (index = 0; index < numbers.length; index++) {
            total += numbers[index];}

        for (subtract = 0; subtract < numbers.length; subtract++) {
            newTotal = total - numbers[subtract];
            //collection[1][subtract] = newTotal;
            totalArray[subtract] = newTotal;
            collection[1] = totalArray;

        }
        return collection;
    }
    public static int calculateMaximum(int[]numbers) {

        int count;
      int maximum = 0;

        int[][] collection = multiDimensionalOfCollection(numbers);
            for (count = 0; count < collection[1].length; count++)  {
               maximum = Math.max(collection[1][0],collection[1][count]);
            }

            return maximum;
    }

    public static int calculateMinimum(int[] numbers) {

        int count;
        int minimum = 0;

        int[][] collection = multiDimensionalOfCollection(numbers);

        for (count = 0; count < collection[1].length; count++)  {
            minimum = Math.min(collection[1][0],collection[1][count]);
        }

        return minimum;
    }

}
