package lab.lab_07_02;

public class Dog extends Animal{
    public int MAX_SPEED = 60;
    Dog(String name){
        this.name = name;
        this.speed = randomSpeed(MAX_SPEED);
    }
}
