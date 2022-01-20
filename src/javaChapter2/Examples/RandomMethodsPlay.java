package javaChapter2.Examples;

import java.security.SecureRandom;

public class RandomMethodsPlay {
    public static void main(String[] args) {
        RandomMethodsPlay showMe = new RandomMethodsPlay();
        showMe.randomNumber();
    }

    private void randomNumber() {
        SecureRandom randomNumber = new SecureRandom();
        RandomMethodsPlay showMe = new RandomMethodsPlay();
        

        int input;
        for( input =1; input < 4; input++ ){
            int randomInput = 1 + randomNumber.nextInt(7);
            showMe.swithMethod(randomInput);
        System.out.println(randomInput);
        }
    }

    private void swithMethod(int randomInput) {
        switch (randomInput) {
            case 1 -> System.out.print("You are now in the search section ");
            case 2 -> System.out.print("You are now in the Service Nos section ");
            case 3 -> System.out.print("You are now in the Add name section ");
            case 4 -> System.out.print("You are now in the Erase section ");
            case 5 -> System.out.print("You are now in the Edit section ");
            case 6 -> System.out.print("You are now in the Assign tone section ");
            case 7 -> System.out.print("You are now in the Send b'card section ");
        }
    }
}
