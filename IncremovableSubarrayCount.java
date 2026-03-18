import java.util.*;

public class IncremovableSubarrayCount {

    public static int incremovableSubarrayCount(int[] nums) {
        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                int prev = Integer.MIN_VALUE;
                boolean valid = true;

                for (int k = 0; k < n; k++) {
                    if (k >= i && k <= j) continue;

                    if (nums[k] <= prev) {
                        valid = false;
                        break;
                    }
                    prev = nums[k];
                }

                if (valid) count++;
            }
        }

        return count;
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

        int result = incremovableSubarrayCount(nums);

        System.out.println("Number of incremovable subarrays: " + result);

        sc.close();
    }
}