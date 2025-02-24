import java.util.ArrayList;
import java.util.Scanner;


public class ArrayList_With_Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        ArrayList<Integer> list = new ArrayList<>(5);
        
        // Input
        for(int i = 0; i<6; i++){
            list.add(in.nextInt());
        }

        // Get item into index
        for(int i = 0; i < 5; i++){
            System.out.println(list.get(i));
        }
    }
}
