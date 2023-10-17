package lab.lab_10;

import java.util.Arrays;

public class AnimalTest {
    public static void main(String[] args) {
        Dog dog = new Dog("dog3");
        Horse horse = new Horse("horse1");
        Tiger tiger = new Tiger("tiger2");
        AnimalController controller = new AnimalController();
        controller.getWinner(Arrays.asList(dog,horse,tiger));
    }
}
