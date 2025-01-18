import java.util.Scanner;

public class Function_Parameters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = in.next();
        String text = myGreet(name);
        System.out.println(text);
    }

    static String myGreet(String name){
        String message = "Hello " + name;
        return message;
    }
}
