public class Exp32_FinalVariable {

    final int value = 10;

    void display() {
        System.out.println("Final value = " + value);
    }

    public static void main(String[] args) {

        Exp32_FinalVariable obj = new Exp32_FinalVariable();
        obj.display();
    }
}