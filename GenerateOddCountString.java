import java.util.*;

public class GenerateOddCountString {

    public static String generateTheString(int n) {
        StringBuilder result = new StringBuilder();

        if (n % 2 == 1) {
            for (int i = 0; i < n; i++) {
                result.append('a');
            }
        } else {
            for (int i = 0; i < n - 1; i++) {
                result.append('a');
            }
            result.append('b');
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        String result = generateTheString(n);

        System.out.println("Generated String: " + result);

        sc.close();
    }
}