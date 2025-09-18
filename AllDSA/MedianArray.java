package AllDSA;

import java.util.Arrays;

public class MedianArray {

    static void medianfun(int arr1[], int arr2[]) {
        int a = arr1.length;
        int b = arr2.length;

        int arr3[] = new int[a + b];
        for (int i = 0; i < a; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < b; i++) {
            arr3[a + i] = arr2[i];
        }

        int c = arr3.length;

        Arrays.sort(arr3);

        if (c % 2 == 0) {
            System.out.println("median is " + (arr3[c / 2] + arr3[c / 2 - 1]) / 2.0);
        } else {
            System.out.println("median is " + arr3[c / 2]);
        }
    }

    public static void main(String[] args) {
        int arr1[] = {1, 9, 5, 8, 3};
        int arr2[] = {8, 6, 3, 7, 3, 2};
        medianfun(arr1, arr2);
    }
}
