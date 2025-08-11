import java.util.Arrays;
import java.util.Scanner;

public class multidimensional_Array {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int[][] arr = new int [3][3];
        System.out.println(arr.length); //No. of rows.

        // Input
        for (int row = 0; row < arr.length; row++) {
            
            // For each col in every row
            for(int col = 0; col < arr[row].length; col++){
                arr [row][col] = in.nextInt();
            }
        }

        // Output
        // for(int row = 0; row < arr.length; row++){

        //     for(int col = 0; col < arr[row].length; col++){
        //         System.out.print(arr [row][col] + " ");
        //     }
        //     System.out.println();
        // }
        
        // // Output (Enhanced for loop)
        // for (int row = 0; row < arr.length; row++){
        //     System.out.println(Arrays.toString(arr[row]));
        // }

        // Output (Enhanced for loop)
        for(int[] a : arr) {    // For every element in array, print the element.
            System.out.println(Arrays.toString(a));
        }
    }
}
