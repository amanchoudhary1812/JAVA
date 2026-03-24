import java.util.Scanner;

public class InputSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers: ");

        System.out.print("Enter First Number: ");
        int x = sc.nextInt();


        System.out.print("Enter Second Number: ");
        int y = sc.nextInt();
        

        System.out.print("Enter Third Number: ");
        int z = sc.nextInt();

        int sum = x + y + z;

        System.out.println("Sum of these numbers is: " + sum);

    }
}
