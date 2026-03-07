
public class MinimumAverageDifference {

    public static int minimumAverageDifference(int[] nums) {
        int n = nums.length;

        long totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        long leftSum = 0;
        long minDiff = Long.MAX_VALUE;
        int resultIndex = 0;

        for (int i = 0; i < n; i++) {

            leftSum += nums[i];
            long rightSum = totalSum - leftSum;

            long leftAvg = leftSum / (i + 1);
            long rightAvg = (i == n - 1) ? 0 : rightSum / (n - i - 1);

            long diff = Math.abs(leftAvg - rightAvg);

            if (diff < minDiff) {
                minDiff = diff;
                resultIndex = i;
            }
        }

        return resultIndex;
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 3, 9, 5, 3};
        System.out.println(minimumAverageDifference(nums));
    }
}