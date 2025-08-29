// import java.util.*;
// public class Sorting{
//  int min = 0 ;
//  public static void sort(int arr[] , size)
//  for(int i=0; i<min; i++){
//     for(int j)
//  }
//     public static void main(String[] args) {
//         int arr[] = {2,5,5,0,8,5,6,8,1};
//         // System.out.println("hello mousam");
//     }
// }
import java.util.*;

public class Sorting {
      static int min = 0;

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            // Swap
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 5, 5, 0, 8, 5, 6, 8, 1};

        sort(arr);
        System.out.println("\nAfter Sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
