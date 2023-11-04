package lab.lab_14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnimalController {
    public List genNewListAnimal(){
        Animal hourse1 = new Horse();
        Animal hourse2 = new Horse();
        Animal tiger1 = new Tiger();
        Animal tiger2 = new Tiger();
        Animal elephant1 = new Elephant();
        Animal elephant2 = new Elephant();
        return Arrays.asList(hourse1,hourse2,tiger1,tiger2,elephant1,elephant2);
    }
    public String getPredictWinner(int numberOfPrediction){
        String win = "";
        int rateHourse = 0;
        int rateTiger = 0;
        int rateElephant = 0;
        int i = 0;
        while(i<numberOfPrediction){
            List listAnimal = genNewListAnimal();
            Animal winner = getMaxSpeed(listAnimal);
            System.out.println(winner.getType());
            if(winner.getType().equals("Horse")) rateHourse++;
            else if (winner.getType().equals("Tiger")) rateTiger++;
            else rateElephant++;
            i++;
        }
       int maxRate = (rateElephant>rateHourse)?rateElephant:rateHourse;
        maxRate = (maxRate>rateTiger)?maxRate:rateTiger;
        if(maxRate == rateElephant) win = (win.equals(""))?"Elephant":win+" Elephant";
        if(maxRate == rateHourse) win = (win.equals(""))?"Horse":win+" Horse";
        if(maxRate == rateTiger) win = (win.equals(""))?"Tiger":win+" Tiger";
        return win;
    }
    public Animal getMaxSpeed(List<Animal> list){
        Animal winner = null;
        double maxSpeed = -1;
        for(Animal anm:list){
            if(anm.getQuantityLegs()==4) {
                if (maxSpeed < anm.getRacingBehaviour().getRacingSpeed()) {
                    maxSpeed = anm.getRacingBehaviour().getRacingSpeed();
                    winner = anm;
                }
            }
        }
        return winner;
    }
}
