package DSASorting;

public class SelectionSortingInt {
     public static void main(String[] args) {
            int arr[] = {8,9,0,1,0,4,6,78,89};
        int n = arr.length;
        for(int i = 0; i< n- 1; i++){
            int minIndex = i;
            for(int j = i+1; j<n ;j++){
                if( arr[j] < arr[minIndex]){
                        minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        for(int value : arr){
            System.out.print(value + " ");
        }
    }
}
