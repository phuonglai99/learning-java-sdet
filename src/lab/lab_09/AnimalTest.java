package lab.lab_09;

import lesson.lesson_09.HouseWithBuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnimalTest {
    public static void main(String[] args) {
        AnimalBuilder.Builder builder = new AnimalBuilder.Builder();
        AnimalBuilder horse = builder.setRandomWithMaxSpeed(75).setWithSwings(false).setName("hourse").build();
        AnimalBuilder tiger = builder.setRandomWithMaxSpeed(60).setWithSwings(false).setName("tiger").build();
        AnimalBuilder dog = builder.setRandomWithMaxSpeed(10).setWithSwings(false).setName("dog").build();
        AnimalBuilder Falcon = builder.setRandomWithMaxSpeed(10000).setWithSwings(true).setName("Falcon").build();
        AnimalBuilder Eagle = builder.setRandomWithMaxSpeed(200000).setWithSwings(true).setName("Eagle").build();

        List animals = new ArrayList(Arrays.asList(horse,tiger,dog,Falcon,Eagle));
        AnimalBuilder winner = new AnimalController().getWinner(animals);
        System.out.printf("Winner is %s with speed %d",winner.getName(),winner.getSpeed());
    }
}
