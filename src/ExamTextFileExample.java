import java.io.*;

public class ExamTextFileExample {
    public static void main(String[] args) {
        try {
            //  Step 1: Save student data in text file
            String name = "Anand";
            int mark = 87;

            BufferedWriter bw = new BufferedWriter(new FileWriter("student_exam.txt"));
            bw.write(name);
            bw.newLine();  // go to next line
            bw.write(String.valueOf(mark));
            bw.close();
            System.out.println("Student exam data written to student_exam.txt\n");

            //  Step 2: Read student data from text file
            BufferedReader br = new BufferedReader(new FileReader("student_exam.txt"));
            String studentName = br.readLine(); // reads first line
            int studentMark = Integer.parseInt(br.readLine()); // reads second line
            br.close();

            System.out.println(" Retrieved Data:");
            System.out.println("Name: " + studentName);
            System.out.println("Mark: " + studentMark);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}