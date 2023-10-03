package lab.lab_04;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RandomArray {
        public static int LENGTH_ARRAY = 10;
        public static int MAX_VALUE = 1000;
        public static void printGameMenu(){
            System.out.println("===MENU===");
            System.out.println("1. Print all numbers");
            System.out.println("2. Print maximum value");
            System.out.println("3. Print minimum value");
            System.out.println("4. Search number");
        }
        public static int getUserInput(String content){
            System.out.println(content);
            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();
            return option;
        }
        public static void playUserOption(List<Integer> array,int options){
            switch (options){
                case 1:
                    printArray(array);
                    break;
                case 2:
                    System.out.println("Maximum value in array is: "+findMaxValue(array));
                    break;
                case 3:
                    System.out.println("Minimum value in array is: "+findMinValue(array));
                    break;
                case 4:
                    int numb = getUserInput("Input your number want to search");
                    System.out.println(getListIndexOfNumber(array,numb));
                    break;
//                default:
//                    System.out.println("Invalid Option");
            }
        }
        public static List<Integer> generateRandomArray(){
            List<Integer> array = new ArrayList<>();
            for(int i=0;i<LENGTH_ARRAY;i++){
                array.add(new SecureRandom().nextInt(MAX_VALUE));
            }
            return array;
        }
        public static void printArray(List<Integer> arrayList){
            System.out.println("Your array is:");
            for(Integer item:arrayList){
                System.out.println(item);
            }
        }
        public static int findMaxValue(List<Integer> arrayList){
            int max = arrayList.get(0);
            for(int i =1;i<arrayList.size();i++){
                if(max<arrayList.get(i)){
                    max = arrayList.get(i);
                }
            }
            return max;
        }
        public static int findMinValue(List<Integer> arrayList){
            int min = arrayList.get(0);
            for(int i =1;i<arrayList.size();i++){
                if(min>arrayList.get(i)){
                    min = arrayList.get(i);
                }
            }
            return min;
        }
        public static String getListIndexOfNumber(List<Integer> arrayList, int number){
            String s = "";
            for(int i=0;i<arrayList.size();i++){
                if(arrayList.get(i)==number){
                    s = s + " " + i;
                }
            }
            return (s.equals(""))?(number+" is not in the list"):(number + " exists in index"+ s);
        }


    public static void main(String[] args) {
        printGameMenu();
        List<Integer> array = generateRandomArray();
        int option = 0;
        do{
            option = getUserInput("Input your option:");
            playUserOption(array,option);
            System.out.println("============");
        }while(option==1||option==2||option==3||option==4);
        System.out.println("====END====");
    }
}
