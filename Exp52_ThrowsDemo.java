import java.io.*;

public class Exp52_ThrowsDemo {

    static void readFile() throws IOException {

        FileReader fr = new FileReader("test.txt");
        BufferedReader br = new BufferedReader(fr);

        System.out.println(br.readLine());
    }

    public static void main(String[] args) {

        try {

            readFile();
        }

        catch(Exception e) {

            System.out.println("File not found");
        }
    }
}