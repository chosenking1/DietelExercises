package javaChapter2;


import java.util.Scanner;

public class Tv {


    public static void main(String[] args) {
        displayOption();
    }
//    private static boolean isOn;
//    public static void turnOn() { isOn = true;}
//
//    public static void turnOff() { isOn = false;}


    public static void displayOption() {

        int select;
        Television lG;

        do {
            String option = """
                    1. Press On
                    2. Press Off
                    """;
            Tv.systemOutput(option);

            select = Tv.userInput();
            switch (select) {
                case 1:
                    String userOption = """
                            Welcome.. Life is Good with lG
                            1. HDMI 1
                            2. TV
                            3. AVA
                            4. SETTINGS
                            """;
                    Tv.systemOutput(userOption);

                    lG = new Television("lG");
                    lG.turnOn();

                    case 2:
                    break;
            }

               // lG.turnOn();
//Tv lG = new Television("lG");




                    int subSelect = Tv.userInput();
                    switch (subSelect){
                        case 1: Tv.tvInput();
                            //subSelect = Tv.userInput();
                            break;
                        case 2:
                            String exit = "Goodbye";
                            Tv.systemOutput(exit);
       }






            }
        while (true);

    }
    public static void tvInput(){

        Tv.systemOutput("""
                                    Welcome to DsTv.
                                    1. To Explore TV Stations press 1
                                    2. Volume
                                    3. If you know the number press 3
                                    """);

        int subSelect = Tv.userInput();
        switch (subSelect){
            case 1: Tv.inputChannelNumber();
            case 2: Tv.volumeMethod();
            case 3: Tv.increaseAndDecreaseChannelNumber();
        }


    }

    private static void increaseAndDecreaseChannelNumber() {

        //if(channelNumber <= 100 &&  > 0)
    }

    private static int volumeMethod() {
        int volume = 1;
        volume++;

        int volumeRocker = Tv.userInput();
if (volume <= 100 && volumeRocker <= 100 && volume > 0){
    volume = volumeRocker + volume ;
    Tv.intOutput(volume);
}return volume;
    }

    private static void intOutput(int select) {

        System.out.println(select);

    }

    private static void inputChannelNumber() {
    }

    public static void systemOutput(String message){
            System.out.print(message);
        }
        public static int userInput(){
            Scanner select = new Scanner(System.in);
            return select.nextInt();
        }


    }
//        for (int count = 0; count < 100;count++){
//            if (Tv.stringInput() == '.') {
//             int v = 0;
//             v++;
//             int volume = 0;
//             volume = volume + v;
//             System.out.println(volume);
//        }
//      }//if (Character.isValidCodePoint(Tv.stringInput()) == Character.isValidCodePoint('.'))
