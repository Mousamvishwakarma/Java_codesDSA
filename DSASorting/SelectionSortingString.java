package DSASorting;

public class SelectionSortingString {
    public static void main(String[] args) {
            String arr[] = { "yogi ", "mousam ", " ashna", "sooryansh ", "abhishek"};
        int n = arr.length;
        for(int i = 0; i< n- 1; i++){
            int minIndex = i;
            for(int j = i+1; j<n ;j++){
                if((arr[j].compareTo(arr[minIndex]) <0 )){
                        minIndex = j;
                }
            }
            String temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        for(String str : arr){
            System.out.print(str + " ");
        }
    }
    }



