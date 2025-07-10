import java.io.*;

public class BufferedPrintWriterDemo {
    public static void main(String[] args) {
        try {
            // Writing to a file using PrintWriter
            PrintWriter pw = new PrintWriter("output.txt");
            pw.println("Hello da boys!");
            pw.println("How are you?");
            pw.close();

            // Reading using BufferedReader
            BufferedReader br = new BufferedReader(new FileReader("output.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println("Line: " + line);
            }
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}