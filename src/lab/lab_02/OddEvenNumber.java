package lab.lab_02;

import java.util.Scanner;

public class OddEvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a integer number: ");
        int number=sc.nextInt();
        System.out.println((number%2==0?"even":"odd"));
    }
}
