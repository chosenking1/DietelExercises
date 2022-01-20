package javaChapter2;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelevisionTest {


    @Test
            public void iCanTurnOnTheTelevisionTest() {
        Television lG = new Television("lG");
        assertFalse(lG.isOn());

        lG.turnOn();
        assertTrue(lG.isOn());
    }

    @Test
    public void iCanTurnOffTheTelevisionTest(){
        Television lG = new Television("lG");
        lG.turnOn();
        assertTrue(lG.isOn());

        lG.turnOff();
        assertFalse(lG.isOn());
    }


    @Test
    public void iCanIncreaseTheVolumeOfTheTelevisionTest() {
        Television lG = new Television("lG");
        lG.turnOn();
        assertTrue(lG.isOn());

        lG.getVolume();
        assertEquals(0, lG.getVolume());

        lG.increaseVolume();
        assertEquals(1, lG.getVolume());
    }


    @Test
    public void iCanDecreaseTheVolumeOfTheTelevisionTest() {
        Television lG = new Television("lG");
        lG.turnOn();
        assertTrue(lG.isOn());

        lG.getVolume();
        assertEquals(0, lG.getVolume());

        for(int i = 0; i < 8; i++){
            lG.increaseVolume();
        }
        assertEquals(8, lG.getVolume());

        lG.decreaseVolume();
        lG.decreaseVolume();
        lG.decreaseVolume();

        assertEquals(5, lG.getVolume());
    }

    @Test
    public void iCantIncreaseBeyond100Test() {
        Television lG = new Television("lG");
        lG.turnOn();
        assertTrue(lG.isOn());

        lG.getVolume();
        assertEquals(0, lG.getVolume());

        for (int i = 0; i < 100; i++) {
            lG.increaseVolume();
        }
        assertEquals(100, lG.getVolume());

        lG.increaseVolume();
        assertEquals(100, lG.getVolume());
    }

    @Test
    public void iCantDecreaseBeyond0Test() {
        Television lG = new Television("lG");
        lG.turnOn();
        assertTrue(lG.isOn());

        lG.getVolume();
        assertEquals(0, lG.getVolume());

        lG.decreaseVolume();
        assertEquals(0, lG.getVolume());
    }
    @Test
    public void volumeIsZeroWhenOffTest(){
        Television lG = new Television("lG");
        lG.turnOff();
        assertFalse(lG.isOn());


        assertEquals(0,lG.getVolume());
    }

    @Test
    public void volumeCantBeIncreasedWhenOffTest(){
        Television lG = new Television("lG");
        lG.turnOff();
        assertFalse(lG.isOn());

        assertEquals(0,lG.getVolume());

        for(int i = 0; i < 20; i++) {
            lG.increaseVolume();
        }
        assertEquals(0,lG.getVolume());

        lG.turnOn();
        assertTrue(lG.isOn());
        assertEquals(0, lG.getVolume());
    }

    @Test
    public void volumeIsRetainedAfterARestartTest(){
        Television lG = new Television("lG");
        lG.turnOn();
        assertTrue(lG.isOn());

        for(int i =0; i < 89; i++){
            lG.increaseVolume();
        }
        assertEquals(89, lG.getVolume());

        lG.turnOff();
        lG.turnOn();
        assertEquals(89, lG.getVolume());
    }

    @Test
    public void channelCanBeChangedTest() {
        Television lG = new Television("lG");
        lG.turnOn();
        assertTrue(lG.isOn());

        lG.getChannel();
        assertEquals(1, lG.getChannel());

        for(int i=0; i <9 ; i++ ){
        lG.changeChannelForward();
        }
        assertEquals(10, lG.getChannel());

            lG.changeChannelBackward();
            lG.changeChannelBackward();
            lG.changeChannelBackward();

        assertEquals(7, lG.getChannel());
    }

    @Test
    public void channelCantGoBeyond1And10Test() {
        Television lG = new Television("lG");
        lG.turnOn();
        assertTrue(lG.isOn());

        lG.getChannel();
        assertEquals(1, lG.getChannel());

        for(int i=0; i <9 ; i++ ){
            lG.changeChannelForward();
        }
        assertEquals(10, lG.getChannel());
        lG.changeChannelForward();
        assertEquals(10, lG.getChannel());


        for (int i = 10; i > 1; i--) {
            lG.changeChannelBackward();
        }
        assertEquals(1, lG.getChannel());
        lG.changeChannelBackward();
        assertEquals(1, lG.getChannel());
    }


    @Test
    public void iCanGetMyChannel() {
        Television lG = new Television("lG");
        lG.turnOn();
        assertTrue(lG.isOn());

        //lG.getChannel();
        //assertEquals(1, lG.getChannel());

        lG.increaseChannel(8);
        assertEquals(8, lG.increaseChannel(8));
    }
}
