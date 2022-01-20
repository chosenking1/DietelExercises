package chapterThree;

public class ClockTest {
    public static void main(String[] args) {
Clock clock = new Clock(10,70,50);
clock.setHour();
        clock.setSecond();
        clock.setMinute();
        System.out.println("The time is: " + clock.getHour() + ":" + clock.getMinute() + ":" + clock.getSecond());
    }
}
