import java.util.Scanner;

public class Exp42_StringModify {

    public static void main(String[] args) {

        String str;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        str = sc.nextLine();

        System.out.println("Replace a with @ : " + str.replace('a','@'));

        System.out.println("Substring (0-3): " + str.substring(0,3));

        System.out.println("Concatenation: " + str.concat(" Java"));

        System.out.println("Trimmed string: " + str.trim());
    }
}