
import java.util.Scanner;

public class SumOfNumberAndItsReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int number = n;
        int r = 0;

        while (n != 0) {
            r *= 10;
            r += (n % 10);
            n /= 10;
        }

        System.out.println("Reversed number :" + r);

        System.out.println("Sum : " + (r + number));
    }
}
