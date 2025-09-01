package DSASorting;

public class SelectionSortingInStringDisendingOR {
     public static void main(String[] args) {
        String[] str = {"yogi", "mousam", "akshit", "abhinav"};
        int n = str.length;

        for (int i = 1; i < n; i++) {
            String key = str[i];
            int j = i - 1;

            while (j >= 0 && isGreater(str[j], key)) {
                str[j + 1] = str[j];
                j--;
            }
            str[j + 1] = key;
        }

        for (String s : str) {
            System.out.print(s + " ");
        }
    }
    private static boolean isGreater(String a, String b) {
        int len1 = a.length();
        int len2 = b.length();
        int minLen = Math.min(len1, len2);

        for (int i = 0; i < minLen; i++) {
            if (a.charAt(i) > b.charAt(i)) return true;
            else if (a.charAt(i) < b.charAt(i)) return false;
        }

        return len1 > len2;
    }
}
