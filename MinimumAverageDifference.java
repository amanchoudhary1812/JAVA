import java.util.*;

public class MinimumAverageDifference {

    public static int minimumAverageDifference(int[] nums) {
        int n = nums.length;

        long totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        long leftSum = 0;
        long minDiff = Long.MAX_VALUE;
        int answer = 0;

        for (int i = 0; i < n; i++) {
            leftSum += nums[i];
            long rightSum = totalSum - leftSum;

            long leftAvg = leftSum / (i + 1);
            long rightAvg = (i == n - 1) ? 0 : rightSum / (n - i - 1);

            long diff = Math.abs(leftAvg - rightAvg);

            if (diff < minDiff) {
                minDiff = diff;
                answer = i;
            }
        }

        return answer;
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

        int result = minimumAverageDifference(nums);

        System.out.println("Minimum Average Difference Index: " + result);

        sc.close();
    }
}