// package DSASorting.Insertion Sort;

public class InsertionSortInInt {
    public static void main(String[] args) {
        int arr[]  = {8,11,6,5,2,7};
        int n = arr.length;

        for(int i =1; i <n;i++){
            int sort = arr[i];
            int j = i-1;

            while (j >= 0 && arr[j] > sort) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j +1] = sort ;
        }
        for(int i =0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
