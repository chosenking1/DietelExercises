package chapterOne;

public class Experiment {
    public static void main(String[] args) {

        int number = 0;
        while (number < 100) {
            number++;
            if (number % 2 == 0) {
                System.out.print(number + " ");
                System.out.println(" ");
            }
            else {
                System.out.print(number + " ");
            }


        }
    }
}


