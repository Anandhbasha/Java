import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter Value");
//        int a = Input.nextInt();
//        Float b = Input.nextFloat();
//        String c = Input.next();
//        String d = Input.nextLine();
        char e = Input.next().charAt(0);
        System.out.println(e);
    }
}
