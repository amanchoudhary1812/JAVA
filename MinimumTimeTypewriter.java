import java.util.*;

public class MinimumTimeTypewriter {

    public static int minTimeToType(String word) {
        int time = 0;
        char current = 'a';

        for (char c : word.toCharArray()) {
            int diff = Math.abs(c - current);
            int move = Math.min(diff, 26 - diff);

            time += move + 1;
            current = c;
        }

        return time;
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter word:");
    String word = sc.nextLine();

    int result = minTimeToType(word);

    System.out.println("Minimum time to type word: " + result);

    sc.close();
    }
}

