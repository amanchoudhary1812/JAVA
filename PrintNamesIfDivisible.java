import java.util.Scanner;

public class PrintNamesIfDivisible {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Number is not a Positive Integer");
        } else if (n % 5 == 0 && n % 3 == 0) {
            System.out.println("Sheetal = Number is divisible by both 5 and 3");
        } else if (n % 3 == 0) {
            System.out.println("Barkha = Number is divisible by 3");
        } else if (n % 5 == 0) {
            System.out.println("Riya = Number is divisible by 5");
        } else {
            System.out.println("Avantika = Number is not divisible by both 5 and 3");
        }
    }
}
