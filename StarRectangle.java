
import java.util.Scanner;

public class StarRectangle {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter number of rows : ");
        int row = sc.nextInt();
        System.out.print("Enter number of columns : ");
        int col = sc.nextInt();

        for (int i = 1; i <= row; i++) { // Kitni lines hogi
            for (int j = 1; j <= col; j++) { // har line mai kitna print hoga
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
