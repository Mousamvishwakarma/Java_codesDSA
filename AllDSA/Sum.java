package AllDSA;
public class Sum {
    public static void main(String[] args) {
        int arr[] ={2,8,6,3,4,7};
        int n =arr.length;
        int sum = 0;
for(int i =0; i<n;i++){
    sum += arr[i];
}
double avg = (double) sum / n;
System.out.println( "avrage of a array is: "+avg);
System.out.println(" sum of a array is: "+sum);
    }
}
