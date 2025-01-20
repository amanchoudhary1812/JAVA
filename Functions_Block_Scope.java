public class Functions_Block_Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20; 
        String name = "Aman";
        {
            //int a = 78;
            a = 100;
            int c = 99;
            name = "Rahul";
            System.out.println(name);
        }
        System.out.println(a);
        System.out.println(name);
        //System.out.println(c);
    }    
}
