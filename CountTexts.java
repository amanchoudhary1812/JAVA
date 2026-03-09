import java.util.*;

public class CountTexts {

    public static int countTexts(String pressedKeys) {
        int mod = 1000000007;
        int n = pressedKeys.length();

        long[] dp = new long[n + 1];
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            char current = pressedKeys.charAt(i - 1);
            int maxPress = (current == '7' || current == '9') ? 4 : 3;

            for (int j = 1; j <= maxPress && i - j >= 0; j++) {
                if (pressedKeys.charAt(i - j) != current) {
                    break;
                }
                dp[i] = (dp[i] + dp[i - j]) % mod;
            }
        }

        return (int) dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter pressed keys: ");
        String pressedKeys = sc.next();

        int result = countTexts(pressedKeys);

        System.out.println("Number of possible texts: " + result);

        sc.close();
    }
}