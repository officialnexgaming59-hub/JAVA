class Animal {

    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {

    void sound() {
        System.out.println("Dog barks");
    }
}

public class Exp25_MethodOverriding {

    public static void main(String[] args) {

        Dog d = new Dog();
        d.sound();
    }
}