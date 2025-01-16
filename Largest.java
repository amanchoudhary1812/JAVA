// Ques. Find the largest of the 3 numbers ?

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        // int max = a;

        // if(b > max){
        //     max = b;
        // }
        
        // if(c > max){
        //     c = max;
        // }

        int max = 0;
        if(a > b){
            max = a;
        }else{
            max = b;
        }
        if(c > max){
            max = c;
        }
        
        System.out.println("Maximum number is: " + max);
    }
}
