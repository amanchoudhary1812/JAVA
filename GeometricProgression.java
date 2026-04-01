import java.util.Scanner;

public class GeometricProgression {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter number of terms : ");

        int n = sc.nextInt();

        int a = 1, r = 2;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            a *= r;
        }

    }
}
