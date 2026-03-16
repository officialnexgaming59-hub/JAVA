import java.util.Scanner;

public class Exp9_Grade {

    public static void main(String[] args) {

        int marks;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        marks = sc.nextInt();

        if(marks >= 90)
            System.out.println("Grade A");
        else if(marks >= 75)
            System.out.println("Grade B");
        else if(marks >= 60)
            System.out.println("Grade C");
        else
            System.out.println("Fail");
    }
}