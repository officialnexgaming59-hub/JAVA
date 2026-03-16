interface A {

    void displayA();
}

interface B {

    void displayB();
}

class C implements A, B {

    public void displayA() {
        System.out.println("Interface A method");
    }

    public void displayB() {
        System.out.println("Interface B method");
    }
}

public class Exp30_MultipleInheritance {

    public static void main(String[] args) {

        C obj = new C();

        obj.displayA();
        obj.displayB();
    }
}