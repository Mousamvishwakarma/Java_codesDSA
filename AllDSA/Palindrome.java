// package AllDSA;

// public class Palindrome {
//     static  String palindromfind(String str){
//         StringBuilder sb = new StringBuilder(str);
//         sb.reverse();
//         String reverse = sb.toString();
//         int maxLenght = 0;
//         String longestPalindrome = "";
//         for(int i = 0; i<str.length();i++){
//             for(int j =i; j<str.length(); j++){
//                 String substring = str.substring(i, j+1);
//                 if(substring.equals(reverse) && substring.length()>maxLenght){
//                     longestPalindrome = substring;
//                     maxLenght = substring.length();
//                 }

//             }
//             return longestPalindrome;
            
//         }
//         }
//     public static void main(String[] args) {
//         String str = "greeksskeerg";
//         String result = palindromfind(str);
//         System.out.println("Longest Palindrome Substring is: " + result);


//     }
    
// }

package AllDSA;

public class Palindrome {

    static String palindromfind(String str) {
        int maxLength = 0;
        String longestPalindrome = "";

        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                String substring = str.substring(i, j + 1);

                String reversed = new StringBuilder(substring).reverse().toString();

                if (substring.equals(reversed) && substring.length() > maxLength) {
                    longestPalindrome = substring;
                    maxLength = substring.length();
                }
            }
        }

        return longestPalindrome;
    }

    public static void main(String[] args) {
        String str = "greeksskeerg";
        String result = palindromfind(str);
        System.out.println("Longest Palindrome Substring is: " + result);
    }
}
