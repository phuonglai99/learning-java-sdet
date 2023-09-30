package lab.lab_03;

public class lab_3_1 {
    //print amount of even numbers and amount of odd numbers in array//
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int countEven = 0;
        for (int i : arr) {
            if(i%2==0) countEven++;
        }
        System.out.printf("even numbers: %d\n",countEven);
        System.out.printf("odd numbers: %d\n",arr.length-countEven);
    }
}

