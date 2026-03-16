interface A {
    void showA();
}

interface B extends A {
    void showB();
}

class C implements B {

    public void showA() {
        System.out.println("Method from Interface A");
    }

    public void showB() {
        System.out.println("Method from Interface B");
    }
}

public class Exp31_InterfaceInheritance {

    public static void main(String[] args) {

        C obj = new C();

        obj.showA();
        obj.showB();
    }
}