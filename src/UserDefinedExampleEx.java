class MyException extends Exception {
    MyException(String msg) {
        super(msg);
    }
}

public class UserDefinedExampleEx {
    static void validate(int marks) throws MyException {
        if (marks < 40) {
            throw new MyException("Fail mark – Not eligible!");
        } else {
            System.out.println("Pass – Eligible");
        }
    }

    public static void main(String[] args) {
        try {
            validate(50);
        } catch (MyException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        }
    }
}
