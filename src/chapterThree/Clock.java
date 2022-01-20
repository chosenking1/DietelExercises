package chapterThree;
//3.14
public class Clock {
private int hour;
private int minute;
private int second;

    public Clock(int hours, int minutes, int seconds){
        hour = hours;
        minute = minutes;
        second = seconds;
    }
    public void setHour(){
        if (hour > 23){
        hour = 0;
        }
    }
    public void setMinute(){
        if (minute > 59){
            minute = 0;
        }
    }
    public void setSecond(){
        if (second > 59){
            second = 00;
        }
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

}

