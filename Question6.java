package assignment2;

public class Question6 {
    int sum(int num1, int num2) {
        return num1 + num2;
    }

    int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static void main(String[] args) {
        Question6 obj = new Question6();
        int result1 = obj.sum(5, 7);
        int result2 = obj.sum(5, 7, 9);

        System.out.println(result1);
        System.out.println(result2);
    }
}

