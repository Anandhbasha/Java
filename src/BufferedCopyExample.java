import java.io.*;

public class BufferedCopyExample {
    public static void main(String[] args) {
        try {
            // Step 1: Open input & output streams
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("input.txt"));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("destination.txt"));

            int byteData;

            // Step 2: Read and write byte-by-byte (but buffered internally)
            while ((byteData = bis.read()) != -1) {
                bos.write(byteData);
            }

            // Step 3: Close streams
            bis.close();
            bos.close();

            System.out.println("File copied successfully using Buffered Streams!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
