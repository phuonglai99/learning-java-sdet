package lab.lab_07_02;

import java.security.SecureRandom;

public class Animal {
    private int speed;
    private String name;

    Animal(String name, int maxSpeed) {
        this.speed = randomSpeed(maxSpeed);
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int randomSpeed(int maxSpeed) {
        return new SecureRandom().nextInt(maxSpeed);
    }


}
