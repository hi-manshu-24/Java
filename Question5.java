package assignment2;

public class Question5 {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eatFood();
        myDog.makeSound();
    }
}

class Animal {
    void eatFood() {
        System.out.println("The animal eats food.");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("The dog barks loudly.");
    }
}
