package assignmentsAndClassworks;

import java.security.SecureRandom;
import java.util.Random;


public class PasswordGenerator {
//  static   char [] capLetter = {'A','B','C','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
//   static char [] lowerCase = {'a', 'b', 'c', 'd','e','f'};
//   static char [] number = {'1','2', '3', '4','5','6'};
static Random random = new Random();

    static SecureRandom random2 = new SecureRandom();
//   static int alphabet = random.nextInt(26)+97;
//   static int number = random.nextInt(10);
//   static char [] number = {'1','2', '3', '4','5','6'};
   private static String password = "";

    public static void main(String[] args) {

        for(int i = 0; i < 12; i++){
//            SecureRandom random = new SecureRandom();
//
//            switch (1 + random.nextInt(3)) {
//                case 1 -> generator(capLetter);
//                case 2 -> generator(lowerCase);
//                case 3 -> generator(number);
//            SecureRandom random = new SecureRandom();
             int alphabet = random.nextInt(26)+97;
            int number = random.nextInt(10);

            switch (1 + random2.nextInt(2)) {
                case 1 -> setPassword((char) alphabet);
                case 2 -> setPassword( number);
//                case 3 -> generator(number);
            }
        }
        System.out.println(password);
    }

//    private static void generator(char[] array) {
////        SecureRandom genRandom = new SecureRandom();
////        int figure = genRandom.nextInt(array.length);
//        char lowercaseChar = (char) ((int)(Math.random()*1000)%26+97);
//
//        setPassword(array[lowercaseChar]);
//    }

    private static void setPassword(char letter) {
        password += letter;
    }
    private static void setPassword(int letter) {
        password += letter;
    }


}
