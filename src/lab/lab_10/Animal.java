package lab.lab_10;

import java.security.SecureRandom;

public abstract class Animal {
    private int speed;
    private String name;

    Animal(String name) {
        this.speed = randomSpeed();
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }
    public abstract int randomSpeed();


}
