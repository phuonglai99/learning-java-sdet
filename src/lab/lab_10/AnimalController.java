package lab.lab_10;

import java.util.List;

public class AnimalController {
    public void getWinner(List<Animal> list){
        int maxSpeed = list.get(0).getSpeed();
        String winnerName = list.get(0).getName();
        for(Animal item:list){
            int currentSpeed = item.getSpeed();
            if(maxSpeed<currentSpeed){
                maxSpeed = item.getSpeed();
                winnerName = item.getName();
            }
        }
        System.out.printf("Winner is %s, with speed: %d",winnerName,maxSpeed);
    }
}
