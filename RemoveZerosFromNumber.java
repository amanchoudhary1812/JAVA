import java.util.Scanner;

public class RemoveZerosFromNumber {

    public static long removeZeros(long n) {
        long result = 0;
        long place = 1;

        while (n > 0) {
            long digit = n % 10;

            if (digit != 0) {
                result += digit * place;
                place *= 10;
            }

            n /= 10;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long n = sc.nextLong();

        long ans = removeZeros(n);

        System.out.println("Number after removing zeros: " + ans);

        sc.close();
    }
}