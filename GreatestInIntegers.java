import java.util.Scanner;

public class GreatestInIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three positive integers :");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a < 0 && b < 0 && c <0) {
            System.out.println("Given Integers are not positive");
        }
        else if (a > b && a > c) { 
            System.out.println(a + " is greater");
        }
        else if (b > c && b > a) {
            System.out.println(b + " is greater");
        }
        else {
            System.out.println(c + " is greater");
        }
    }
}
