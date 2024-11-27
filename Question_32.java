package assignment1;

class FirstClass {
    int value;

    public FirstClass(int value) {
        this.value = value;
        display();
    }

    public void display() {
        System.out.println("The value passed to the constructor is: " + value);
    }
}

public class Question_32 {
    public static void main(String[] args) {
        FirstClass obj = new FirstClass(7);
        obj.display();
    }
}

