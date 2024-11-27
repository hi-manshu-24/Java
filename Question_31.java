package assignment1;

class MyClass {
    public MyClass() {
        System.out.println("Zero-argument constructor called");
    }

    public void displayMessage() {
        System.out.println("Message from MyClass object: " + this);
    }
}

public class Question_31 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.displayMessage();
    }
}

