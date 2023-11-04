package lab.lab_14;

import java.security.SecureRandom;

public class Horse extends Animal {
   // - Horse: Tốc độ của ngựa dao động từ 15-24m/s.
   public final int MIN_SPEED = 15;
   public final int MAX_SPEED = 24;
   public Horse(){
      this.type = "Horse";
      this.quantityLegs = 4;
      this.name = "";
      this.setRacingBehaviour(new RacingWithOnlySpeed(MIN_SPEED,MAX_SPEED));
      this.setSpeed();
   }

}
