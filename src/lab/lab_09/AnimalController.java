package lab.lab_09;

import java.util.List;

public class AnimalController {
    public AnimalBuilder getWinner(List<AnimalBuilder> list){
        AnimalBuilder winner = null;
        int maxSpeed = -1;
        for(AnimalBuilder item:list){
                if(!item.isWithSwings()) {
                    int currentSpeed = item.getSpeed();
                    if (maxSpeed < currentSpeed) {
                        maxSpeed =currentSpeed;
                        winner = item;
                    }
                }
        }
        return winner;
    }
}
