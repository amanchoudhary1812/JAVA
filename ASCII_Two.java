public class ASCII_Two {
    public static void main (String[] args) {

        // Uppercase
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println( ch + "->" + (int)ch);
        }

        //Lowercase
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.println( ch + "->" + (int)ch);
        }
    }
}
