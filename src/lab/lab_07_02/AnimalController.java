package lab.lab_07_02;

import java.util.List;

public class AnimalController {
    public void getWinner(List<Animal> list){
        int maxSpeed = list.get(0).speed;
        String winnerName = "";
        for(Animal item:list){
            int currentSpeed = item.speed;
            if(maxSpeed<currentSpeed){
                maxSpeed = item.speed;
                winnerName = item.name;
            }
        }
        System.out.printf("Winner is %s, with speed: %d",winnerName,maxSpeed);
    }
}
