import java.util.Scanner;

public class Exp43_StringSplit {

    public static void main(String[] args) {

        String str;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        str = sc.nextLine();

        System.out.println("Ends with 'java': " + str.endsWith("java"));

        System.out.println("Is Empty: " + str.isEmpty());

        System.out.println("Length: " + str.length());

        String words[] = str.split(" ");

        System.out.println("Words in string:");

        for(String w : words)
        System.out.println(w);
    }
}