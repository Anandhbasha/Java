import java.util.*;

public class PropertiesDemo {
    public static void main(String[] args) {
        Properties p = new Properties();
        p.setProperty("user", "admin");
        p.setProperty("pass", "1234");

        System.out.println(p.getProperty("user"));  // admin
    }
}