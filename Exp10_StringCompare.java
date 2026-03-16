import java.util.Scanner;

public class Exp10_StringCompare {

    public static void main(String[] args) {

        String s1, s2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        s2 = sc.nextLine();

        if(s1.equals(s2))
            System.out.println("Strings are equal");
        else
            System.out.println("Strings are not equal");
    }
}