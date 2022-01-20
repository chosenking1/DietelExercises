package javaChapter2;

public class Kata {
    //int total = 0;
    public static int calculateTotalOf(int[] numbers) {
        int total = 0;
        for (int number : numbers) {

            total += number;

        }
     return total;

    }

    public static int calculateMinimumOf(int[] numbers) {

        int minimum = Integer.MAX_VALUE;
        for (int scoreIndex = 0; scoreIndex < numbers.length; scoreIndex++) {
            if (numbers[scoreIndex] < minimum) {
                minimum = numbers[scoreIndex];
            }
        }
        return minimum;
    }

    public static int calculateMaximumOf(int[] numbers) {

        int maximum = Integer.MIN_VALUE;
        for (int scoreIndex = 0; scoreIndex < numbers.length; scoreIndex++) {
            if (numbers[scoreIndex] > maximum) {
                maximum = numbers[scoreIndex];
            }
        }
        return maximum;
    }

    public static double calculateAverageOf(int[] numbers) {

        double average = Integer.MAX_VALUE;
        for (int scoreIndex = 0; scoreIndex < numbers.length; scoreIndex++) {
            average = Kata.calculateTotalOf(numbers) / (numbers.length * 1.0);

        }
        return average;
    }

    public char calculateGradeFor(int score) {
        if (score > 90) return 'A' ;
        if (score >= 80) return 'B';
        if (score >= 70) return 'C';
        if (score >= 60) return 'D';
        //if (score >= 50) return 'F';
        return 'F';
    }

    public int getPrice(int quantity) {
         if ((quantity<= 4) && (quantity >= 1)) return 2000 * quantity;

        if ((quantity<= 9) && (quantity >= 5)) return 1800 * quantity;

        if ((quantity<= 29) && (quantity >= 10)) return 1600 * quantity;

        if ((quantity<= 49) && (quantity >= 30)) return 1500 * quantity;

        if ((quantity<= 99) && (quantity >= 50)) return 1300 * quantity;

        if ((quantity<= 199) && (quantity >= 100)) return 1200 * quantity;

        if ((quantity<= 499) && (quantity >= 200)) return 1100 * quantity;
        return 1000 * quantity;

    }
    public void display(String [][] newArray) {
        // String[][] collection = new String[newArray.length][];

        for (int firstLoop = 0; firstLoop < newArray.length; firstLoop++) {
            System.out.println();
            for (int secondLoop = 0; secondLoop < newArray[firstLoop].length; secondLoop++) {
                System.out.print(" " + newArray[firstLoop][secondLoop]);

            }
        }
    }
}



