package assignment2;

public class Question20 {
    public static void main(String[] args) {
        try {
            int[] numbers = new int[-3];
        } catch (NegativeArraySizeException ex) {
            System.out.println("Caught NegativeArraySizeException.");
        }

        try {
            int a = 10;
            int b = 0;
            int result = a / b;
        } catch (ArithmeticException ex) {
            System.out.println("Caught ArithmeticException.");
        }
    }
}

