public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {15,19,21,27,33,5,8,11,13};
        System.out.println(countRotations(arr));
    }

    public static int countRotations(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            // If the array is already sorted
            if (nums[start] <= nums[end]) {
                return start;
            }

            int mid = start + (end - start) / 2;
            int next = (mid + 1) % nums.length;
            int prev = (mid - 1 + nums.length) % nums.length;

            // Check if mid is the smallest
            if (nums[mid] <= nums[next] && nums[mid] <= nums[prev]) {
                return mid;
            }

            if (nums[mid] >= nums[start]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return 0; // No rotation
    }
}
