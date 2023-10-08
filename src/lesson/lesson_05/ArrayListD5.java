package lesson.lesson_05;

import java.util.*;

public class ArrayListD5 {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"test");
        //Set<Integer> key = map.keySet();
        for(Integer item:map.keySet()){
            map.remove(item);
        }
        System.out.println(map);
    }
}
