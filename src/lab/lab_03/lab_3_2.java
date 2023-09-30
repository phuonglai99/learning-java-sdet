package lab.lab_03;

public class lab_3_2 {
    //finding min max of array//
    public static void main(String[] args) {
        int[] arr = {1,0,10,11,-1,0,-1};
        int max = arr[0], min = arr[0];
        for (int i : arr) {
            if(i>max) max = i;
            if(i<min) min = i;
        }
        System.out.println("minimum: "+min);
        System.out.println("maximum: "+max);
    }
}
