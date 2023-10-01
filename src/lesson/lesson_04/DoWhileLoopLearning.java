package lesson.lesson_04;

import java.security.SecureRandom;
import java.util.Scanner;

public class DoWhileLoopLearning {
    public static void main(String[] args) {
       int  guessingTime = 0;
        int randomNumber = new SecureRandom().nextInt(10);
        do{
            Scanner scanner=new Scanner(System.in);
            System.out.println("Please input number: ");
            int userInputNum = scanner.nextInt();

            if(userInputNum == randomNumber){
                System.out.println("Hooray!");
                break;
            }
            guessingTime++;
        }while(guessingTime<3);
        if(guessingTime==3) System.out.println("Good luck!!!");
    }
}
