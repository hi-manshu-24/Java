package assignment2;

class Example {
    int x;
    int y;

    Example() {
        x = 0;
        y = 0;
    }

    Example(int a) {
        x = a;
        y = 0;
    }

    Example(int a, int b) {
        x = a;
        y = b;
    }

    void display() {
        System.out.println("x = " + x + ", y = " + y);
    }
}

public class Question4 {
    public static void main(String[] args) {
        Example obj1 = new Example();
        Example obj2 = new Example(2);
        Example obj3 = new Example(4, 6);

        obj1.display();
        obj2.display();
        obj3.display();
    }
}

