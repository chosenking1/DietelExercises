package assignmentsAndClassworks;

public class LunchBike {
    private Boolean on;
   // private int accelerate;
    private int gear;
    //private int decelerate;
    private int speed ;

    public void kickStart() { on = true;}

    public void turnOff() { on = false;}
    public boolean powerCheck() { return on;}

public void accelerationChange(int accelerate){
        LunchBike bot =  new LunchBike();
 bot.setGear(accelerate);
    this.speed += accelerate * gear;
//        if (gear == 1){
//            speed += accelerate * gear;
//    }

//    if (gear == 2){
//        speed += accelerate * gear;
//    }
//    if (gear == 3){
//        speed += accelerate * gear;
//    }
//    if (gear == 4){
//        speed += accelerate * gear;
//    }
}
public void decelerate(int decelerate){
    if (gear == 1){
        speed -= decelerate * gear;
    }

    if (gear == 2){
        speed -= decelerate * gear;
    }
    if (gear == 3){
        speed -= decelerate * gear;
    }
    if (gear == 4){
        speed -= decelerate * gear;
    }
}
     public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setGear(int speed){
if (speed >= 0 && speed <= 20 ) {
    gear = 1;
}
if (speed > 20 &&  speed <= 30 ){
    gear = 2;
}
if (speed > 30 && speed<= 40){
    gear = 3;
}
else gear = 4;
}

   public int display(){

   return speed;
    }

}