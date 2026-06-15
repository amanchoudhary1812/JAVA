import java.util.*;

public class NthDigit {

    public static int findNthDigit(int n) {

        long digits = 1;
        long count = 9;
        long start = 1;

        // Find the block containing the nth digit
        while (n > digits * count) {
            n -= digits * count;

            digits++;
            count *= 10;
            start *= 10;
        }

        // Find the actual number
        start += (n - 1) / digits;

        String num = String.valueOf(start);

        // Find the digit within that number
        return num.charAt((int)((n - 1) % digits)) - '0';
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input n
        int n = sc.nextInt();

        // Output answer
        System.out.println(findNthDigit(n));

        sc.close();
    }
}