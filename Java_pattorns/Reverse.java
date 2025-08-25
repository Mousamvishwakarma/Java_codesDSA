
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt(); 

        int rev = 0; 

        for (int i = num; i != 0; i = i / 10) {
            int digit = i % 10;    
            rev = rev * 10 + digit; 
        }

        System.out.println("Reversed number: " + rev);

        sc.close();
    }
}
