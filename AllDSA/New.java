import java.util.*;

public class New {

    static String palindromelongest(String str) {
        StringBuilder sb = new StringBuilder(str); // Use StringBuilder for easy reversal
        sb.reverse();// Reverse the string
        String reversed = sb.toString(); 
        int maxLength = 0;
        String longestPalindrome = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                String substring = str.substring(i, j + 1);
                if (substring.equals(reversed.substring(i, j + 1)) && substring.length() > maxLength) {
                    maxLength = substring.length();
                    longestPalindrome = substring;
                }
            }
        }
        return longestPalindrome;
    }

    public static void main(String[] args) {
        String str = "greeksskeeerg";
        String result = palindromelongest(str);
        System.out.println("Longest Palindrome: " + result);
    }
}


// package AllDSA;

// public class Palindrome {

//     static String palindromfind(String str) {
//         int maxLength = 0;
//         String longestPalindrome = "";

//         for (int i = 0; i < str.length(); i++) {
//             for (int j = i; j < str.length(); j++) {
//                 String substring = str.substring(i, j + 1);

//                 String reversed = new StringBuilder(substring).reverse().toString();

//                 if (substring.equals(reversed) && substring.length() > maxLength) {
//                     longestPalindrome = substring;
//                     maxLength = substring.length();
//                 }
//             }
//         }

//         return longestPalindrome;
//     }

//     public static void main(String[] args) {
//         String str = "greeksskeerg";
//         String result = palindromfind(str);
//         System.out.println("Longest Palindrome Substring is: " + result);
//     }
// }
