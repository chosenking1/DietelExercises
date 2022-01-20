package javaChapter2;

public class ChiTelevision {
    private boolean isOn;
    private int volume = 0;
    private int channel = 1;
    public ChiTelevision(String modelName){

    }

    public boolean isOn() {
        return isOn;
    }
    public void turnOn(){isOn = true;}
    public void turnoff(){isOn = false;}

    public void getVolume(){
        if(isOn) {

        }
    }
}
