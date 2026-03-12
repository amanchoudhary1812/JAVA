import java.util.*;

public class LargestSubstringBetweenEqualCharacters {

    public static int maxLengthBetweenEqualCharacters(String s) {
        int[] first = new int[26];
        Arrays.fill(first, -1);

        int maxLength = -1;

        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';

            if (first[index] == -1) {
                first[index] = i;
            } else {
                maxLength = Math.max(maxLength, i - first[index] - 1);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        int result = maxLengthBetweenEqualCharacters(s);

        System.out.println("Largest substring length: " + result);

        sc.close();
    }
}