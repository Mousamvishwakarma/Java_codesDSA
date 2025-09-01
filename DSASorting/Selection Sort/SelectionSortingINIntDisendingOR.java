package DSASorting;
import java.util.*;
public class SelectionSortingINIntDisendingOR {
    public static void main(String[] args) {
        int array[] ={8,9,2,4,6,7,0};
        int n = array.length;
        for(int i =0; i<n-1;i++){
            int minIndex = i;
             for(int j=i+1; j<n; j++){
                 if(array[j] > array[minIndex]){
                 minIndex = j;

                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
     for(int num : array){
        System.out.print(num + " ");
     }
    }
}
