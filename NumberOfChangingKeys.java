import java.util.*;

public class NumberOfChangingKeys {

    public static int countKeyChanges(String s) {
        s = s.toLowerCase();
        int count = 0;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        int result = countKeyChanges(s);

        System.out.println("Number of key changes: " + result);

        sc.close();
    }
}