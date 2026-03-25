import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int n = sc.nextInt();

        if (n % 2 == 0)
            System.out.println("Entered number is Even");
        else
            System.out.println("Entered number is Odd");

        
        // Divisible by 5 or not?

        // System.out.print("Enter no divisible by 5: ");
        // int x = sc.nextInt();

        // if (x % 5 == 0) 
        //     System.out.println("It's divisible");
        // else
        //     System.out.println("It's not divisible");
    }
}
