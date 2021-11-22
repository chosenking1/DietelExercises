package chapterOne;




public class LoopOfOddEven {
    public static void main(String[] args){

      int number = 0;
        while(number < 100) {
            number++;
            if (number % 2 == 0) {

                System.out.print(number + " ");


            }

        }
        System.out.println("Odd is");
        int number2 = 0;
        while(number2 < 100) {
            number2++;
            if (number2 % 2 != 0) {
                System.out.print(number2 + " ");
            }
        }

    }
}
