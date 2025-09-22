package AllDSA;

import java.util.Arrays;

public class MergeSortedArrays {
    public static void merge(int[] ARR1, int M, int[] ARR2, int N) {
        int i = M - 1, j = N - 1, k = M + N - 1;

        while (i >= 0 && j >= 0) {
            if (ARR1[i] > ARR2[j]) {
                ARR1[k] = ARR1[i];
                i--;
            } else {
                ARR1[k] = ARR2[j];
                j--;
            }
            k--;
        }

        // Copy remaining elements from ARR2 (if any)
        while (j >= 0) {
            ARR1[k] = ARR2[j];
            j--;
            k--;
        }
    }

    public static void main(String[] args) {
        int[] ARR1 = {1, 3, 5, 0, 0, 0};
        int[] ARR2 = {2, 4, 6};
        int M = 3, N = 3;

        merge(ARR1, M, ARR2, N);
        System.out.println(Arrays.toString(ARR1));
    }
}
