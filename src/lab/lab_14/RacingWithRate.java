package lab.lab_14;

import java.security.SecureRandom;

public class RacingWithRate implements RacingBehaviour {
    private int MIN_SPEED;
    private int MAX_SPEED;
    private double RATE;

    public RacingWithRate(int min, int max, double rate) {
        this.MIN_SPEED = min;
        this.MAX_SPEED = max;
        this.RATE = rate;
    }
    @Override
    public double getRacingSpeed() {
        double speed = (MIN_SPEED + new SecureRandom().nextInt(MAX_SPEED - MIN_SPEED)) * RATE;
        return speed;
    }
}
