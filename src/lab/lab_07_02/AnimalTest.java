package lab.lab_07_02;

import java.util.Arrays;

public class AnimalTest {
    public static void main(String[] args) {
        Dog dog = new Dog("dog3");
        Horse hourse = new Horse("horse1");
        Tiger tiger = new Tiger("tiger2");
        //System.out.println(dog.randomSpeed(9000));
        //System.out.println(dog.name);
        AnimalController controller = new AnimalController();
        controller.getWinner(Arrays.asList(dog,hourse,tiger));
    }
}
