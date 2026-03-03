import java.util.*;

public class CheckArrayFormation {

    public static boolean canFormArray(int[] arr, int[][] pieces) {
        Map<Integer, int[]> map = new HashMap<>();

        // Store each piece by its first element
        for (int[] piece : pieces) {
            map.put(piece[0], piece);
        }

        int i = 0;

        while (i < arr.length) {
            if (!map.containsKey(arr[i])) {
                return false;
            }

            int[] piece = map.get(arr[i]);

            for (int num : piece) {
                if (i >= arr.length || arr[i] != num) {
                    return false;
                }
                i++;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input arr
        System.out.print("Enter size of arr: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements of arr:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input pieces
        System.out.print("Enter number of pieces: ");
        int m = sc.nextInt();
        int[][] pieces = new int[m][];

        for (int i = 0; i < m; i++) {
            System.out.print("Enter size of piece " + (i + 1) + ": ");
            int size = sc.nextInt();
            pieces[i] = new int[size];

            System.out.println("Enter elements of piece " + (i + 1) + ":");
            for (int j = 0; j < size; j++) {
                pieces[i][j] = sc.nextInt();
            }
        }

        boolean result = canFormArray(arr, pieces);
        System.out.println("Can form array: " + result);

        sc.close();
    }
}