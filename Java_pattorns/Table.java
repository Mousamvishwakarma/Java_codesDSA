import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
       Scanner mo = new Scanner(System.in);
       
    System.out.println("Enter your number :");
    int n = mo.nextInt();

    for(int i = 1; i < 11; i++){
         System.out.println(n*i);
    }
    mo.close();
    }
}
