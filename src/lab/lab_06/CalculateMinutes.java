package lab.lab_06;

import java.util.HashMap;
import java.util.Map;

public class CalculateMinutes {
    public static Map<String, Integer> extractTime(String s) {
        Map<String, Integer> time = new HashMap<>();
        int endHrs = s.indexOf("hrs");
        int startMinutes = s.indexOf("d ");
        int endMinutes = s.indexOf(" minutes");
        String minutes = s.substring(startMinutes + 2, endMinutes);
        String hrs = s.substring(0, endHrs);
        time.put("hrs", Integer.valueOf(hrs));
        time.put("minutes", Integer.valueOf(minutes));
        return time;
    }

    public static int calculateMinunes(String s) {
        Map<String, Integer> time = extractTime(s);
        return time.get("hrs") * 60 + time.get("minutes");
    }

    public static void main(String[] args) {
        String test = "01hrs and 0 minutes";
        System.out.println(calculateMinunes(test));
    }
}
