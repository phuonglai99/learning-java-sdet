package lab.lab_03;

public class lab_3_4 {
    //merge two ordered arrays//
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        int[] c = new int[a.length + b.length];
        int indexa = 0, indexb = 0, indexc = 0;
        while (indexc < c.length) {
            if (indexa == a.length) {
                c[indexc++] = b[indexb++];
            } else if (indexb == b.length) {
                c[indexc++] = a[indexa++];
            } else if (a[indexa] > b[indexb]) {
                c[indexc++] = b[indexb++];
            } else {
                c[indexc++] = a[indexa++];
            }
            //indexc++;
        }
        for (int i : c) {
            System.out.println(i);
        }
    }
}
