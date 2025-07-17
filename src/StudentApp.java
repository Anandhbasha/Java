import java.util.*;
import java.util.stream.*;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return name + " - " + marks;
    }
}

public class StudentApp {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Anbu", 90),
                new Student("Bala", 45),
                new Student("Chitra", 67)
        );

        List<String> result = students.stream()
                .filter(s -> s.marks >= 50)
                .map(s -> {
                    String grade = s.marks > 80 ? "A" : (s.marks > 60 ? "B" : "C");
                    return s.name + " - Grade: " + grade;
                })
                .collect(Collectors.toList());

        result.forEach(System.out::println);
    }
}
