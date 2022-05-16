package assignmentsAndClassworks;

import java.awt.*;
import java.security.SecureRandom;
import java.util.regex.Pattern;


public class PasswordGenerator {
  static   char [] capLetter = {'A','B','C','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
   static char [] lowerCase = {'a', 'b', 'c', 'd','e','f'};
   static char [] number = {'1','2', '3', '4','5','6'};
   private static String password = "";

    public static void main(String[] args) {
        for(int i = 0; i < 12; i++){
            SecureRandom random = new SecureRandom();

            switch (1 + random.nextInt(3)) {
                case 1 -> generator(capLetter);
                case 2 -> generator(lowerCase);
                case 3 -> generator(number);
            }
        }
        System.out.println(password);
    }

    private static void generator(char[] array) {
        SecureRandom genRandom = new SecureRandom();
        int figure = genRandom.nextInt(array.length);
        setPassword(array[figure]);
    }

    private static void setPassword(char letter) {
        password += letter;
    }


}
