import java.io.*;

public class ThrowsExample {
    public static void readFile() throws IOException {
        FileReader fr = new FileReader("test.txt"); // May throw IOException
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("File not found or error reading it.");
        }
    }
}