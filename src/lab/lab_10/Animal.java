package lab.lab_10;

import java.security.SecureRandom;

public abstract class Animal {
    protected int speed;
    protected String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract int getSpeed();

    public abstract int randomSpeed();

}
