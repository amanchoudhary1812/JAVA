import java.util.*;

public class Parameters {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter your name : ");
        String name = sc.next();
        String text = myGreet(name);
        System.out.println(text);
    }

    static String myGreet (String name) {
        String message = "Hello " + name;
        return message;
    }
}
