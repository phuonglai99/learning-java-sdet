package lab.lab_07_02;

public class Tiger extends Animal{
    public int MAX_SPEED = 100;
    Tiger(String name){
        super();
        this.name = name;
        this.speed = randomSpeed(MAX_SPEED);
    }
}
