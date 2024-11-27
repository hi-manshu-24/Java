package assignment2;

public class Question15 {
    public static void main(String[] args) {
        NumberDemo demoObject = new NumberDemo(25);
        demoObject.display();
    }
}

class NumberDemo {
    int number;

    NumberDemo(int number) {
        this.number = number;
    }

    void display() {
        System.out.println("The number is: " + this.number);
    }
}
