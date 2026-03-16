class Student {

    String name = "Rahul";
    int marks = 85;

    void display() {
        System.out.println(name + " " + marks);
    }
}

public class Exp63_StudentPackage {

    public static void main(String[] args) {

        Student s = new Student();
        s.display();
    }
}