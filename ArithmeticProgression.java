import java.util.Scanner;

public class ArithmeticProgression {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the number of terms : ");
        int n = sc.nextInt();

        // for (int i=2; i<= 3*n - 1; i+=3) {
        //     System.out.println(i + " ");
        // }

        for (int i=5; i<= 5*n ; i+=5) {
            System.out.println(i + " ");
        }

    }
}
