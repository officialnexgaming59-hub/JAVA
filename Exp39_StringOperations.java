import java.util.Scanner;

public class Exp39_StringOperations {

    public static void main(String[] args) {

        String str;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        str = sc.nextLine();

        System.out.println("Length: "+str.length());

        System.out.println("Uppercase: "+str.toUpperCase());

        System.out.println("Lowercase: "+str.toLowerCase());

        System.out.println("Character at index 2: "+str.charAt(2));
    }
}