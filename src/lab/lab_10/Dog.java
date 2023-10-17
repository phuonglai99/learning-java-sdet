package lab.lab_10;

import java.security.SecureRandom;

public class Dog extends Animal {
    private final static int MAX_SPEED = 60;
    Dog(String name){
        super(name);
    }
    public int randomSpeed(){
        return new SecureRandom().nextInt(MAX_SPEED);
    }
}
