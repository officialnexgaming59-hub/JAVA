import java.util.ArrayList;

public class Exp44_ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("ArrayList: " + list);

        list.remove(1);

        System.out.println("After removal: " + list);
    }
}