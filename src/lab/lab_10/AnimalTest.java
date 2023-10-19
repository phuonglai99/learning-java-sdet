package lab.lab_10;

import java.util.Arrays;

public class AnimalTest {
    public static void main(String[] args) {
        Animal dog = new Dog("dog3");
        Animal horse = new Horse("horse1");
        Animal tiger = new Tiger("tiger2");
        AnimalController controller = new AnimalController();
        controller.getWinner(Arrays.asList(dog,horse,tiger));
    }
}
