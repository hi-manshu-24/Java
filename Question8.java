package assignment2;

public class Question8 {
    public static void main(String[] args) {
        Animal.show();
        Dog.show();
    }

    static class Animal {
        static void show() {
            System.out.println("This is the Animal class.");
        }
    }

    static class Dog extends Animal {
        static void show() {
            System.out.println("This is the Dog class.");
        }
    }
}

