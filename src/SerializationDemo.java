import java.io.*;

// Step 1: Create a Serializable class
class StudentExam implements Serializable {
    String name;
    int mark;

    public StudentExam(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    public void showDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Mark Scored: " + mark);
    }
}

public class SerializationDemo  {
    public static void main(String[] args) {
        try {
            // Step 2: Create a student and save exam data
            StudentExam s1 = new StudentExam("Anand", 87);

            // Step 3: Serialize (store in file)
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("examdata.ser"));
            oos.writeObject(s1);
            oos.close();
            System.out.println("Student exam data saved successfully.\n");

            // Step 4: Deserialize (read from file)
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("examdata.ser"));
            StudentExam s2 = (StudentExam) ois.readObject();
            ois.close();

            System.out.println(" Retrieved Student Exam Details:");
            s2.showDetails();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
