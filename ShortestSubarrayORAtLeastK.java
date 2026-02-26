import java.util.*;

public class ShortestSubarrayORAtLeastK {

    public static int minimumSubarrayLength(int[] nums, int k) {
        int n = nums.length;
        int[] bitCount = new int[32];

        int left = 0;
        int currentOR = 0;
        int ans = Integer.MAX_VALUE;

        for (int right = 0; right < n; right++) {

            // Add current number to window
            for (int b = 0; b < 32; b++) {
                if (((nums[right] >> b) & 1) == 1) {
                    bitCount[b]++;
                    if (bitCount[b] == 1) {
                        currentOR |= (1 << b);
                    }
                }
            }

            // Shrink window while OR >= k
            while (left <= right && currentOR >= k) {
                ans = Math.min(ans, right - left + 1);

                for (int b = 0; b < 32; b++) {
                    if (((nums[left] >> b) & 1) == 1) {
                        bitCount[b]--;
                        if (bitCount[b] == 0) {
                            currentOR &= ~(1 << b);
                        }
                    }
                }

                left++;
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        int result = minimumSubarrayLength(nums, k);

        System.out.println("Shortest subarray length with OR >= k: " + result);

        sc.close();
    }
}