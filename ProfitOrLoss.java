import java.util.Scanner;

public class ProfitOrLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter Cost Price: ");
        // int CP = sc.nextInt();
        // System.out.print("Enter Selling Price: ");
        // int SP = sc.nextInt();

        // if (SP > CP) {
        //     System.out.println("Seller made a profit");
        //     System.out.println("Seller made a profit of = " + (SP - CP) + "rs");
        //     System.out.println("Seller made " + ((double)(SP - CP) / CP * 100) + "% Profit");
        // } 
        // else if (SP == CP) {
        //     System.out.println("Seller made no Profit no Loss");
        // }
        // else {
        //     System.out.println("Seller made an Incurred loss");
        //     System.out.println("Seller made an loss of = " + (CP - SP) + "rs");
        // }

        System.out.print("Enter Cost Price: ");
        double CP = sc.nextDouble();

        System.out.print("Enter Selling Price: ");
        double SP = sc.nextDouble();

        double diff = SP - CP; // single calculation

        if (diff > 0) {
            System.out.println("Profit = " + diff + " rs");
            System.out.println("Profit % = " + (diff * 100 / CP) + "%");
        } 
        else if (diff < 0) {
            diff = -diff; // make positive
            System.out.println("Loss = " + diff + " rs");
            System.out.println("Loss % = " + (diff * 100 / CP) + "%");
        } 
        else {
            System.out.println("No Profit No Loss");
        }

        sc.close(); // good practice
    }
}
