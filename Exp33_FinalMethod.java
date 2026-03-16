class A {

    final void show() {
        System.out.println("This is a final method");
    }
}

class B extends A {

    void display() {
        System.out.println("Subclass method");
    }
}

public class Exp33_FinalMethod {

    public static void main(String[] args) {

        B obj = new B();

        obj.show();
        obj.display();
    }
}