package lab.lab_07_02;

public class Horse extends Animal{
    public final int MAX_SPEED = 75;
    Horse(String name){
        this.name = name;
        this.speed = randomSpeed(MAX_SPEED);
    }
}
