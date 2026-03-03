import java.util.*;

public class LC2619_ArrayLast {

    public static int last(int[] nums) {
        if (nums.length == 0) {
            return -1;
        }
        return nums[nums.length - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // size of array
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // array input
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = last(nums);
        System.out.println("Last element: " + result);

        sc.close();
    }
}

