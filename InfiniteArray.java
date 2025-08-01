// Question : Find the Position of an Element in Infinite Sorted Array

// We're simulating an infinite array using a fixed-size array, but your end index may go out of bounds during range expansion. 

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170, 180, 190, 200, 210};
        int target = 130;
        System.out.println(ans(arr, target));
    }
    static int ans (int[] arr, int target) {
        // first find the range
        // first start with a box of size 2
        int start = 0;
        int end = 1;

        // condition for the target to lie in the range
        while (target > arr[end]) {
            int newStart = end + 1; // this is my new start
            // double the box value
            // end = previous end + sizeofbox * 2
            end = end + (end - start +1) * 2;
            start = newStart;
        }
        
        return binarySearch (arr, target, start, end);

    }

    static int binarySearch (int[] arr, int target, int start, int end) {

        while (start <= end) {
            
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid -1;
            } else if (target > arr[mid]) {
                start = mid +1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
