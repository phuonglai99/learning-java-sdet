package lab.lab_07_02;

import java.util.Arrays;

public class AnimalTest {
    public static void main(String[] args) {
        Dog dog = new Dog("dog");
        Horse hourse = new Horse("horse");
        Tiger tiger = new Tiger("tiger");
        //System.out.println(dog.randomSpeed(9000));
        //System.out.println(dog.name);
        AnimalController controller = new AnimalController();
        controller.getWinner(Arrays.asList(dog,hourse,tiger));
    }
}
