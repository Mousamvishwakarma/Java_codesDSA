package AllDSA;
public class Max {
    public static void main(String[] args) {

        int arr[] = { 4, 0,2, 9, 3, 7, 65, 21, 36, 78, 54, 556 };
        int n = arr.length;
       
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
            min = arr[i];
            }
        }

        System.out.println("minimumVlaue is: "+ min);
    }

}
