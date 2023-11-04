package lab.lab_14;

import java.security.SecureRandom;
public class Tiger extends Animal {
   //   - Tiger: Tốc độ (S) phụ thuộc vào cân nặng (W) theo tỉ lệ 0.06, cân nặng trung bình của 1 con tiger dao động từ 250 - 400 kg
   public final int MIN_WEIGHT = 250;
   public final int MAX_WEIGHT = 400;
   public final double RATE = 0.06;
   public Tiger(){
      this.type = "Tiger";
      this.quantityLegs = 4;
      this.name = "";
      this.setRacingBehaviour(new RacingWithRate(MIN_WEIGHT,MAX_WEIGHT,RATE));
      this.setSpeed();
   }
   }
