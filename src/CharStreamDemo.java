import java.io.*;
public class CharStreamDemo {
    public static void main(String[] args) throws Exception {
        FileReader reader = new FileReader("input.txt");
        FileWriter writer = new FileWriter("output.txt");

        int ch;
        while ((ch = reader.read()) != -1) {
            writer.write(ch);
        }

        reader.close();
        writer.close();
        System.out.println("File copied using Character Stream");
    }
}
