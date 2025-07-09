import java.io.*;//Used to read/write binary data (like images, videos, PDF files).
public class ByteStreamDemo {
    public static void main(String[] args) throws Exception {
        try{
            FileInputStream in = new FileInputStream("input.txt");
            FileOutputStream out = new FileOutputStream("output.txt");

            int i;
            while ((i = in.read()) != -1) {
                out.write(i);
            }

            in.close();
            out.close();
            System.out.println("File copied using Byte Stream");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
