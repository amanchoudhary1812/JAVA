// Take length and breadth of ractangle as input and WAP to find whether the area of rectangle is greater than its perimeter

import java.util.Scanner;

public class AreaPerimeterOfRectangle {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter length: ");
        double L = sc.nextDouble();

        System.out.print("Enter breadth: ");
        double B = sc.nextDouble();

        double area = L * B;
        double perimeter = 2 * (L + B);

        if (area > perimeter) {
            System.out.println("Area is greater than Perimeter");
        } else if (area < perimeter) {
            System.out.println("Perimeter is greater than Area");
        } else {
            System.out.println("Area and Perimeter are equal");
        }

        sc.close();
    }
}
