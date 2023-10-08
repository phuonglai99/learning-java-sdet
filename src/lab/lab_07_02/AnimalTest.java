package lab.lab_07_02;

import java.util.Arrays;

public class AnimalTest {
    public static void main(String[] args) {
        Dog dog = new Dog("dog");
        Horse hourse = new Horse("horse");
        Tiger tiger = new Tiger("tiger");
        AnimalController controller = new AnimalController();
        controller.getWinner(Arrays.asList(dog,hourse,tiger));
    }
}
