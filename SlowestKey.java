import java.util.*;

public class SlowestKey {

    public static char slowestKey(int[] releaseTimes, String keysPressed) {
        int maxDuration = releaseTimes[0];
        char result = keysPressed.charAt(0);

        for (int i = 1; i < releaseTimes.length; i++) {
            int duration = releaseTimes[i] - releaseTimes[i - 1];
            char key = keysPressed.charAt(i);

            if (duration > maxDuration || (duration == maxDuration && key > result)) {
                maxDuration = duration;
                result = key;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter number of keys: ");
        int n = sc.nextInt();

        int[] releaseTimes = new int[n];

        // Input release times
        System.out.println("Enter release times:");
        for (int i = 0; i < n; i++) {
            releaseTimes[i] = sc.nextInt();
        }

        // Input keys pressed
        System.out.print("Enter keys pressed string: ");
        String keysPressed = sc.next();

        char result = slowestKey(releaseTimes, keysPressed);
        System.out.println("Slowest key: " + result);

        sc.close();
    }
}