package javaChapter2.Examples;

public class PrimeNumbersDisplay {
    public static  String primeNumber(int limit) {
        int composite = 0;

        int multiple;
        String prime = "";

        for (multiple = 2; multiple <= limit; multiple++) {
            for (int factor = 2; factor < multiple; factor++) {

                if (multiple % factor == 0) {
                    composite = multiple;
                }

                }
            if (multiple != composite) {
                prime += " " + multiple;
            }

        }
        return prime;

    }
}
