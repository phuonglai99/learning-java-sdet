package lab.lab_14;

import java.security.SecureRandom;

public class Elephant extends Animal {
//- Elephant: Tốc độ (S) tỉ lệ thuận với chiều dài sải chân (T) theo tỉ lệ 6.0, sải chân của 1 con voi dao động từ 3-4m
    public final int MIN_STRIDE = 250;
    public final int MAX_STRIDE = 400;
    public final double RATE = 0.06;
    public Elephant(){
        this.type = "Elephant";
        this.quantityLegs = 4;
        this.name = "";
        this.setRacingBehaviour(new RacingWithRate(MIN_STRIDE,MAX_STRIDE,RATE));
        this.setSpeed();
    }
}
