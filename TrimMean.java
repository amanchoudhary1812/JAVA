import java.util.*;

public class TrimMean {

    public static double trimMean(int[] arr) {
        Arrays.sort(arr);

        int n = arr.length;
        int remove = n / 20; // 5%

        int sum = 0;

        for (int i = remove; i < n - remove; i++) {
            sum += arr[i];
        }

        return (double) sum / (n - 2 * remove);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        double result = trimMean(arr);

        System.out.println("Trimmed mean: " + result);

        sc.close();
    }
}