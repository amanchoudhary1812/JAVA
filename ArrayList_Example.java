import java.util.ArrayList;

public class ArrayList_Example {
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(66);
        list.add(77);
        list.add(33);
        list.add(22);
        list.add(99);
        list.add(88);

        System.out.println(list.contains(66));
        System.out.println(list.contains(546));
        System.out.println(list);
        list.set(0, 55);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
    }
}
