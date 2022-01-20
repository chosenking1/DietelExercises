package javaChapter2.Examples;
//write a number that runs through another loop, to check if it can divide through,
//if it has a factor it's not a prime number
public class PrimeNumbersB {
    public static void main(String[] args) {

        int composite = 0;

        for (int firstNum = 2; firstNum <= 10000; firstNum++) {

            for (int secondNum = 2; secondNum < firstNum; secondNum++) {

                if (firstNum % secondNum == 0) {
                    composite = firstNum;
                }
//                System.out.print("");
                    }
            if (firstNum != composite){
                System.out.println(firstNum);
            }
                }

            }


    }










