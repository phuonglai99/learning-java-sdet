package lab.lab_07_02;

public class Horse extends Animal{
    public int MAX_SPEED = 75;
    Horse(String name){
        super();
        this.name = name;
        this.speed = randomSpeed(MAX_SPEED);
    }
}
