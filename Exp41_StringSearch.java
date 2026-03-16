import java.util.Scanner;

public class Exp41_StringSearch {

    public static void main(String[] args) {

        String str;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        str = sc.nextLine();

        System.out.println("First occurrence of 'a': " + str.indexOf('a'));
        System.out.println("Last occurrence of 'a': " + str.lastIndexOf('a'));

        if(str.contains("java"))
            System.out.println("Substring 'java' found");
        else
            System.out.println("Substring not found");

        if(str.startsWith("Hello"))
            System.out.println("String starts with Hello");
        else
            System.out.println("Does not start with Hello");
    }
}