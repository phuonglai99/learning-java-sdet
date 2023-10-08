package lab.lab_07_02;

import java.security.SecureRandom;

public class Animal {
    public int speed;
    public String name;

    public int randomSpeed(int maxSpeed){
       return new SecureRandom().nextInt(maxSpeed);
    }
}
