package AllDSA;
import java.util.Arrays;

public class TriangleFormation {
    public static boolean canFormTriangle(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] + arr[i+1] > arr[i+2]) {
                return true; // Triangle can be formed
            }
        }
        return false; // No triangle possible
    }

    public static void main(String[] args) {
        int[][] testCases = {
            {3, 4, 5},
            {1, 10, 12, 30}
        };

        for (int[] testCase : testCases) {
            if (canFormTriangle(testCase)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
