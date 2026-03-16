interface Animal {

    void sound();
}

class Cat implements Animal {

    public void sound() {

        System.out.println("Cat meows");
    }
}

public class Exp58_InterfaceReference {

    public static void main(String[] args) {

        Animal a = new Cat();

        a.sound();
    }
}