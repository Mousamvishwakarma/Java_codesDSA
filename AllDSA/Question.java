public class Question {
public static void swapArrays(int[] a, int[] b) {
    if (a.length != b.length) {
        System.out.println("Arrays must be of same length to swap.");
        return;
    }
    for (int i = 0; i < a.length; i++) {
        int temp = a[i];
        a[i] = b[i];
        b[i] = temp;
    }
}

public static void swapStrings() {
    String a = "Hello", b = "World";
    System.out.println("Before Swap: a = " + a + ", b = " + b);
    String temp = a;
    a = b;
    b = temp;
    System.out.println("After Swap: a = " + a + ", b = " + b);
}




public static String toLower(String str) {
    char[] chars = str.toCharArray();
    for (int i = 0; i < chars.length; i++) {
        if (chars[i] >= 'A' && chars[i] <= 'Z') {
            chars[i] = (char)(chars[i] + 32);
        }
    }
    return new String(chars);
}




public static String toUpper(String str) {
    char[] chars = str.toCharArray();
    for (int i = 0; i < chars.length; i++) {
        if (chars[i] >= 'a' && chars[i] <= 'z') {
            chars[i] = (char)(chars[i] - 32);
        }
    }
    return new String(chars);
}




public static String removeConsonants(String str) {
    String result = "";
    for (int i = 0; i < str.length(); i++) {
        char c = str.charAt(i);
        if (!isConsonant(c)) {
            result += c;
        }
    }
    return result;
}
public static boolean isConsonant(char c) {
    c = (c >= 'A' && c <= 'Z') ? (char)(c + 32) : c; 
    return (c >= 'a' && c <= 'z') && !(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
}






public static void countCharacters(String str) {
    int vowels = 0, consonants = 0, digits = 0, spaces = 0, symbols = 0;
    for (int i = 0; i < str.length(); i++) {
        char c = str.charAt(i);
        if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
            char lower = (c >= 'A' && c <= 'Z') ? (char)(c + 32) : c;
            if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u')
                vowels++;
            else
                consonants++;
        } else if (c >= '0' && c <= '9') {
            digits++;
        } else if (c == ' ') {
            spaces++;
        } else {
            symbols++;
        }
    }
    System.out.println("Vowels: " + vowels);
    System.out.println("Consonants: " + consonants);
    System.out.println("Digits: " + digits);
    System.out.println("Spaces: " + spaces);
    System.out.println("Symbols: " + symbols);
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






public static int[][] addMatrices(int[][] a, int[][] b) {
    int rows = a.length;
    int cols = a[0].length;
    int[][] result = new int[rows][cols];
    for (int i = 0; i < rows; i++)
        for (int j = 0; j < cols; j++)
            result[i][j] = a[i][j] + b[i][j];
    return result;
}




public static int[][] subtractMatrices(int[][] a, int[][] b) {
    int rows = a.length;
    int cols = a[0].length;
    int[][] result = new int[rows][cols];
    for (int i = 0; i < rows; i++)
        for (int j = 0; j < cols; j++)
            result[i][j] = a[i][j] - b[i][j];
    return result;
}




public static int[][] multiplyMatrices(int[][] a, int[][] b) {
    int rows = a.length;
    int cols = b[0].length;
    int common = b.length;
    int[][] result = new int[rows][cols];
    for (int i = 0; i < rows; i++)
        for (int j = 0; j < cols; j++)
            for (int k = 0; k < common; k++)
                result[i][j] += a[i][k] * b[k][j];
    return result;
}





public static int diagonalSum(int[][] matrix) {
    int sum = 0;
    for (int i = 0; i < matrix.length; i++) {
        sum += matrix[i][i]; 
    }
    return sum;
}



public static void main(String[] args) {
    String test = "Hello123! ";
    System.out.println("Original: " + test);
    System.out.println("Lower: " + toLower(test));
    System.out.println("Upper: " + toUpper(test));
    System.out.println("Without Consonants: " + removeConsonants(test));
    countCharacters(test);
    System.out.println("Sorted: " + sortCharacters(test));
}

}