package lab.lab_10;

import java.security.SecureRandom;

public class Tiger extends Animal {
    public final static int MAX_SPEED = 100;
    Tiger(String name){
        this.name = name;
        this.speed = randomSpeed();
}
    @Override
    public int getSpeed() {
        return this.speed;
    }
    public int randomSpeed(){
        return new SecureRandom().nextInt(MAX_SPEED);
    }
}
