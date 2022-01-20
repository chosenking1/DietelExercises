package chapterFour;
//4.17
import javaChapter2.Examples.PrimeNumbersDisplay;

import java.util.Scanner;

public class GasMileage {
    int milesDriven;
    int gallons;

    public static void display(int message){
        System.out.println(message);
    }
    public static void display(String message){
        System.out.println(message);
    }
    public static void display(double message){
        System.out.println(message);
    }
    public static int  inputMethod(String message) {
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        //int input = scanner.nextInt();
        return scanner.nextInt();
    }
    public void loop(){

        while (milesDriven != 3){
             milesDriven = GasMileage.inputMethod("Type in the millage");
             gallons = GasMileage.inputMethod("Type in the Gallon");
             GasMileage.average(milesDriven, gallons);

        }
    }

    public static void average(int distance, int fuel) {
        int average = fuel / distance;
        GasMileage.display(average);


    }
}


