package assignmentsAndClassworks;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class LunchBikeTest {
    @Test
    public void bikeCanAccelerate() {
        LunchBike kata = new LunchBike();
       //int acceleration;
        kata.accelerationChange(10);
        //acceleration
        int speed  = kata.display();
        assertEquals(10, speed);
    }
}
