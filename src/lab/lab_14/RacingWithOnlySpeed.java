package lab.lab_14;

import java.security.SecureRandom;

public class RacingWithOnlySpeed implements RacingBehaviour{
    private int MIN_SPEED;
    private int MAX_SPEED;
    public RacingWithOnlySpeed(int min, int max){
        this.MIN_SPEED = min;
        this.MAX_SPEED = max;
    }
    @Override
    public double getRacingSpeed() {
        double speed = MIN_SPEED + new SecureRandom().nextInt(MAX_SPEED-MIN_SPEED);
        return speed;
    }
}
