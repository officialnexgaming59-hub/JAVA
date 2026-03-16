interface Demo {

    default void show() {

        System.out.println("Default Method");
    }
}

public class Exp57_DefaultMethod implements Demo {

    public static void main(String[] args) {

        Exp57_DefaultMethod obj = new Exp57_DefaultMethod();

        obj.show();
    }
}