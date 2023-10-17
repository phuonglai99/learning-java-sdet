package lab.lab_09;

import java.util.List;

public class AnimalController {
    public AnimalBuilder getWinner(List<AnimalBuilder> list){
        AnimalBuilder winner = list.get(0);
        for(AnimalBuilder item:list){
            int currentSpeed = item.getSpeed();
            if(winner.getSpeed()<currentSpeed){
                winner = item;
            }
        }
        return winner;
    }
}
