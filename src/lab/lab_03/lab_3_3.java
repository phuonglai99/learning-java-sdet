package lab.lab_03;

public class lab_3_3 {
    //sort array min to max//
    public static void main(String[] args) {
        int[] arr = {100,1,10,11};
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 1-i; j++) {
                if (arr[j] > arr[j + 1])
                {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}

