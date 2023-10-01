package lab.lab_04;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Scanner;

public class RandomArray {
        public static int LENGTH_ARRAY = 10;
        public static int MAX_VALUE = 1000;
        public static ArrayList<Integer> generateRandomArray(){
            ArrayList<Integer> array = new ArrayList<>();
            for(int i=0;i<LENGTH_ARRAY;i++){
                array.add(new SecureRandom().nextInt(MAX_VALUE));
            }
            return array;
        }
        public static void printArray(ArrayList<Integer> arrayList){
            for(Integer item:arrayList){
                System.out.println(item);
            }
        }
        public static int findMaxValue(ArrayList<Integer> arrayList){
            int max = arrayList.get(0);
            for(int i =1;i<arrayList.size();i++){
                if(max<arrayList.get(i)){
                    max = arrayList.get(i);
                }
            }
            return max;
        }
        public static int findMindValue(ArrayList<Integer> arrayList){
            int min = arrayList.get(0);
            for(int i =1;i<arrayList.size();i++){
                if(min>arrayList.get(i)){
                    min = arrayList.get(i);
                }
            }
            return min;
        }
        public static String getListIndexOfNumber(ArrayList<Integer> arrayList, int number){
            String s = "";
            for(int i=0;i<arrayList.size();i++){
                if(arrayList.get(i)==number){
                    s = s + " " + i;
                }
            }
            return (s.equals(""))?(number+" is not in the list"):(number + " exists in index"+ s);
        }


    public static void main(String[] args) {
        ArrayList<Integer> arr = generateRandomArray();
        printArray(arr);
        System.out.println("Max value in array is: "+findMaxValue(arr));
        System.out.println("Min value in array is: "+findMindValue(arr));
        System.out.println("input number want to search: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(getListIndexOfNumber(arr,number));
    }
}
