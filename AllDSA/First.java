// Write a program for swapping of two arrays.
// Write a program for swapping of two strings.
// Write a program to convert the string from upper case to lower case.
// Write a program to convert the string from lower case to upper case.
// Write a program to delete all consonants from a given string.
// Write a program to count the different types of characters in given string.
// Write a program to sort the characters of a string.  
// Write a program for addition of two matrices.
// Write a program for subtraction  of two matrices.
// Write a program for multiplication of two matrices.
// Write a program to find out the sum of diagonal element of a matrix.
//

//--------------****************--------------******************-------------******************


// Write a program for swapping of two arrays.
public class First {
// public static void swapArrays(int[] a, int[] b) {
//     if (a.length != b.length) {
//         System.out.println("Arrays must be of same length to swap.");
//         return;
//     }
//     for (int i = 0; i < a.length; i++) {
//         int temp = a[i];
//         a[i] = b[i];
//         b[i] = temp;
//     }
// }

// Write a program for swapping of two strings.
//     public static void main(String[] args) {
//         String str1 = "Hello";
//         String str2 = "World";

//         String temp = str1;
//         str1 = str2;
//         str2 = temp;

//         System.out.println("First string: " + str1);
//         System.out.println("Second string: " + str2);
//     }

// Write a program to convert the string from upper case to lower case.

//     public static void main(String[] args) {
//         String upper = "HELLO WORLD";
//         String lower = upper.toLowerCase();
//         System.out.println("Upper case: " + upper);
//         System.out.println("Lower case: " + lower);
//     }

// Write a program to convert the string from lower case to upper case.
// public class Convert {
//     public static void main(String[] args) {
//         String lower = "hello world";
//         String upper = lower.toUpperCase();
//         System.out.println("Lower case:" + lower);
//         System.out.println("Upper case:" + upper);
//     }
// }

public static void main(String[] args) {
    String input = "hello";
    String sorted = sortCharacters(input);
    System.out.println("Original: " + input);
    System.out.println("Sorted: " + sorted);
}

public static String sortCharacters(String str) {
    char[] chars = str.toCharArray();

    for (int i = 0; i < chars.length - 1; i++) {
        for (int j = i + 1; j < chars.length; j++) {
            if (chars[i] > chars[j]) {
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
            }
        }
    }
    return new String(chars);
}
}