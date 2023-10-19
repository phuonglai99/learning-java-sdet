package lab.lab_10;

import java.security.SecureRandom;

public class Horse extends Animal {
    public final static int MAX_SPEED = 75;
    Horse(String name){
        this.name = name;
        this.speed = randomSpeed();
    }
    @Override
    public int getSpeed() {
        return this.speed ;
    }
    public int randomSpeed(){
        return new SecureRandom().nextInt(MAX_SPEED);
    }
}
