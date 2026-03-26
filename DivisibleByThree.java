// Print all odd numbers divisible by 3 between 1 to 100

import java.util.Scanner;

public class DivisibleByThree {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        // for (int i = 3; i <= 100; i += 3) {
        //     if (i % 2 == 1)
        //         System.out.println(i + " ");
        // }

        for (int i = 3; i <= 100; i += 6) {
                System.out.print(i + " ");
        }
    }
}
