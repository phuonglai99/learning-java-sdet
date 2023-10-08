package lab.lab_07_02;

public class Dog extends Animal{
    private int MAX_SPEED = 60;
    Dog(String name){
        this.speed = randomSpeed(MAX_SPEED);
        this.name = name;
    }

}
