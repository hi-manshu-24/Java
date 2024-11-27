package assignment2;

public class Question19 {
    public static void main(String[] args) {
        try {
            int[] numbers = new int[3];
            numbers[5] = 50;
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Caught ArrayIndexOutOfBoundsException.");
        }

        try {
            int x = 5;
            int y = 0;
            int result = x / y;
        } catch (ArithmeticException ex) {
            System.out.println("Caught ArithmeticException.");
        }

        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException ex) {
            System.out.println("Caught NullPointerException.");
        }

        try {
            int[] numbers = new int[2];
            numbers[3] = 10;
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Caught an exception in the catch block.");
        } finally {
            System.out.println("This is the finally block. It always runs.");
        }

        try {
            String value = "abc";
            int num = Integer.parseInt(value);
        } catch (NumberFormatException ex) {
            System.out.println("Caught NumberFormatException.");
        } catch (Exception ex) {
            System.out.println("Caught a generic exception.");
        }
    }
}

