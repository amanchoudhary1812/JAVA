import java.util.Scanner;

public class Print_Numbers {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for (int num = 1; num <= n; num++) {
            System.out.print(num + " ");
            System.out.println("Hello world");
        }

    }
}
