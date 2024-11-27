package assignment2;

public class Question22 {
    public static void main(String[] args) {
        try {
            int result1 = performOperation(10, 0);
            int result2 = performOperation(10, 5);
        } catch (MyArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int performOperation(int num1, int num2) throws MyArithmeticException {
        if (num2 == 0) {
            throw new MyArithmeticException("Error: Cannot divide by zero.");
        }

        if (num1 % num2 != 0) {
            throw new MyArithmeticException("Error: The division is not an integer.");
        }

        return num1 / num2;
    }
}

class MyArithmeticException extends Exception {
    public MyArithmeticException(String message) {
        super(message);
    }
}

