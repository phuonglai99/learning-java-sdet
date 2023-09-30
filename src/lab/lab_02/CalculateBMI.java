package lab.lab_02;

import java.util.Scanner;

public class CalculateBMI {
    public static void main(String[] args) {
        //comment
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your weight(kg): ");
        float weight = sc.nextFloat();
        System.out.println("Please enter your height(m): ");
        float height = sc.nextFloat();
        sc.close();
        if (height <= 0 || weight<=0) {
            System.out.println("Wrong input, it must be positive number bigger than 0!!");
        } else {
            float BMI = weight / height / 2;
            System.out.printf("Your BMI is: %f\n", BMI);
            if (BMI < 18.5) {
                //calculate amount of weight need to increase which compared to current weight
                float increaseWeight = (18.5f * height * 2) - weight;
                System.out.printf("Underweight \nTry to increase your weight by %f kg to reach normal weight", increaseWeight);
            } else if (BMI <= 24.9) {
                System.out.println("Normal weight \nKeep your weight");
            } else if (BMI <= 29.9) {
                //calculate amount of weight need to decrease which compared to current weight
                float decreaseWeight = weight - (24.9f * height * 2);
                System.out.printf("Overweight \nTry to decrease your weight by %f kg to reach normal weight", decreaseWeight);
            } else {
                //calculate amount of weight need to decrease which compared to current weight
                float decreaseWeight = weight - (24.9f * height * 2);
                System.out.printf("Obesity \nTry to decrease your weight by %f kg to reach normal weight", decreaseWeight);
            }
        }
    }
}

