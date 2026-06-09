import java.util.Arrays;

public class FlattenedMatrix {
    public static void main (String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int target = 8;
        System.out.println(Arrays.toString(search(arr, target)));
    }

    static int[] search(int[][] arr, int target) {
        int row = arr.length;
        int column = arr[0].length;

        while (row < arr.length && column >= 0) {
            if (arr[row][column] == target) {
                return new int[] {row, column};
            }
            if (arr[row][column] < target) {
                row++;
            } else {
                column --;
            }
        }
        return new int[] {-1, -1};
    }
}
