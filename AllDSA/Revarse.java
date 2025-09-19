package AllDSA;
public class Revarse {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,7,8,9};
        int n = arr.length;
        // for(int i = n-1; i>=0 ; i--){
        //     System.out.print(arr[i]);
        // }
        int [] copy = new  int[n];
        for(int i= 0; i<n; i++){
            copy[i] =  arr[i];
        }
        System.out.println(copy+  " onee to two copy");
    }
}
