interface Shape {

    void area();
}

class Circle implements Shape {

    public void area() {

        double r = 5;

        System.out.println("Area of Circle = " + (3.14*r*r));
    }
}

public class Exp55_ShapeInterface {

    public static void main(String[] args) {

        Circle c = new Circle();

        c.area();
    }
}