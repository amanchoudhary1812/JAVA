import java.util.Scanner;

public class LiesInWhichQuadrant {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x axis point : ");
        int x = sc.nextInt();

        System.out.print("Enter y axis point : ");
        int y = sc.nextInt();

        if (x == 0 && y == 0) {
            System.out.println("At the origin");
        }
        else if (y == 0) {
            System.out.println("Lies on x-axis");
        }
        else if (x == 0) {
            System.out.println("Lies on y-axis");
        }
        else if (x > 0 && y > 0) {
            System.out.println("1st Quadrant");
        }
        else if (x < 0 && y > 0) {
            System.out.println("2nd Quadrant");
        }
        else if (x < 0 && y < 0) {
            System.out.println("3rd Quadrant");
        }
        else {
            System.out.println("4th Quadrant");
        }
        sc.close();
    }
}
