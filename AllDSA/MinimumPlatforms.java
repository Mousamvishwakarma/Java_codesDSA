import java.util.Arrays;
public class MinimumPlatforms {
    public static int findPlatforms(int[] arrival, int[] departure) {
        Arrays.sort(arrival);
        Arrays.sort(departure);

        int n = arrival.length;
        int platform_needed = 1, max_platforms = 1;
        int i = 1, j = 0;

        while (i < n && j < n) {
            if (arrival[i] <= departure[j]) {
                platform_needed++;
                i++;
            } else {
                platform_needed--;
                j++;
            }
            max_platforms = Math.max(max_platforms, platform_needed);
        }

        return max_platforms;
    }

    public static void main(String[] args) {
        int[] arrival = {900, 940, 950, 1100, 1500, 1800};
        int[] departure = {910, 1200, 1120, 1130, 1900, 2000};

        System.out.println("Minimum number of platforms required: " + findPlatforms(arrival, departure));
    }
}
