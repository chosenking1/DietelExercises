package chapterSeven;

import java.util.Random;

public class DiceRolling {
    public static void main(String[] args) {
        int randomCount = 0;
        int randomCount1;
        int total = 0;
        int count5 = 0;
        int count4 = 0 ;
        int count3 = 0;
        int count2 = 0;
        int count6 = 0;
        int count7 = 0 ;
        int count8 = 0;
        int count9 = 0;
        int count10 = 0;
        int count11 = 0 ;
        int count12 = 0;

        int[] contain = new int[11];
        Random digit = new Random();
      //  while (randomCount < 10)
        for (randomCount = 1; randomCount <= 36_000_000; randomCount++) {
            //randomCount++;

            int die1 = 1 + digit.nextInt(6);
            int die2 = 1 + digit.nextInt(6);
            total = die1 + die2;


            if (total == 2) {

                count2++;

            }

             if (total == 3) {

                count3++;

            }

            if (total == 4) {

                count4++;

            }
            if (total == 5) {
                count5++;

            }
            if (total == 6) {
                count6++;

            }
            if (total == 7) {
                count7++;

            }
            if (total == 8) {
                count8++;

            }
            if (total == 9) {
                count9++;

            }
            if (total == 10) {
                count10++;

            }
            if (total == 11) {
                count11++;
            }
            if (total == 12) {
                count12++;

            }
        }

        contain[0] = count2;
        contain[1] = count3;
        contain[2] = count4;
        contain[3] = count5;
        contain[4] = count6;
        contain[5] = count7;
        contain[6] = count8;
        contain[7] = count9;
        contain[8] = count10;
        contain[9] = count11;
        contain[10] = count12;

        System.out.println();
        for (randomCount1 = 0; randomCount1 < 11; randomCount1++) {

            System.out.println(contain[randomCount1]);
        }
//        for(int i = 0; i < 5; i++){
//          count2 ++;
//            i = count2;
//        }
    }
}

//        for(count = 1; count < 5; count++){
//            System.out.println(total);
//        }



