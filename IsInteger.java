import java.util.Scanner;

public class IsInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double x = sc.nextDouble();
        // int n = (int)x;

        if (x == (int)x ) // (n - x > 0 is also works but not for negative numbers and Integers are both -ve and +ve numbers)
                         // (x - (int)x == 0)
            System.out.println("Given number is an integer");
        else
            System.out.println("Given number is not an Integer");
    }
}
