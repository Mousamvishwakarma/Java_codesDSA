public class Wpattorn {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 1; i<=n; i++){
            for(int j= 1 ; j<=i; j++){
                System.out.print("* ");
            }
            int spaces = 2 * (n-i);
            for(int j =1; j<=spaces; j++){
                System.out.println(" ");
            }
            for( int j=1; j<=i; j++){
                System.out.println("* ");
            }
            System.out.println();
        }
    }
}
