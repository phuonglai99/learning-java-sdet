package lesson.lesson_09;

import java.util.ArrayList;
import java.util.List;

public class BuilderDesignTest {
    //.| dot notation
    public static void main(String[] args) {
        HouseWithBuilder.Builder builder = new HouseWithBuilder.Builder();
        builder.setColor("brown").setMainDoors(2).setWindows(5).setRoofTopColor("west");
        List houseList = new ArrayList<HouseWithBuilder>();
        houseList.add(new HouseWithBuilder(builder));
    }
}
