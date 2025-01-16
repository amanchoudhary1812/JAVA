// Ques. Print numbers from 1 to n.

import java.util.Scanner;

public class One_To_n {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int num = 1; num <= n; num += 1){
            
            System.out.print(num + " ");

            System.out.println("Hello World");
        }
    }
}
