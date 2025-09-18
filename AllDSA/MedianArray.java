package AllDSA;

import java.util.Arrays;

public class MedianArray {

    static void medianfun(int arr1[], int arr2[]) {
        int a = arr1.length; //5
        int b = arr2.length; //6
        int arr3[] = new int[a + b]; //11

        for (int i = 0; i < a; i++) {
            arr3[i] = arr1[i]; //1,9,5,8,3
        }
        for (int i = 0; i < b; i++) {
            arr3[a + i] = arr2[i]; //8,6,3,7,3,2
        }

        int c = arr3.length; //11

        Arrays.sort(arr3); //2,3,3,5,6,7,8,8,9

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
