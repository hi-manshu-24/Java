package assignment2;

public class Question13 {
    public static void main(String[] args) {
        Youngest childObject = new Youngest();
        childObject.display();
    }
}

class Ancestor {
    void display() {
        System.out.println("This is the Ancestor class.");
    }
}

class ParentGeneration extends Ancestor {
    void display() {
        System.out.println("This is the Parent Generation class.");
    }
}

class Youngest extends ParentGeneration {
    void display() {
        System.out.println("This is the Youngest class.");
    }
}
