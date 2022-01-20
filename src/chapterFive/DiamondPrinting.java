package chapterFive;

public class DiamondPrinting {
    public static void main(String[] args) {
        int first = 1;
        int second = 1;
        int third;

        for (first = 1; first <= 9; first+=2) {
                System.out.println();
                for(third = first; third <= 9; third+=2) {
                    System.out.print(" ");
                }
                for (second = 1; second <= first; second++) {

                    System.out.print("*");
                }
            }

            for (first = 8; first >= 1; first-=2) {
                System.out.println();
                for(third = first; third <= 11; third+=2) {
                    System.out.print(" ");
                }

                for (third = 2; third <= first; third++) {

                    System.out.print("*");

            }
        }
    }
}

