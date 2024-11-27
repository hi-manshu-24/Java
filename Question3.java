package assignment2;

public class Question3 {
    int number;

    Question3(int number) {
        this.number = number;
    }

    public static void main(String[] args) {
        Question3 obj = new Question3(10);
        System.out.println("Number = " + obj.number);
    }
}