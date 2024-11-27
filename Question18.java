package assignment2;

public class Question18 {
    public static void main(String[] args) {
        AllMethods obj = new AllMethods();
        obj.taskOne();
        obj.taskTwo();
        obj.taskThree();
        obj.finalTask();
        obj.showConcreteMethod();
    }
}

interface FirstInterface {
    void taskOne();
    void taskTwo();
}

interface SecondInterface {
    void taskThree();
    void taskFour();
}

interface ThirdInterface {
    void taskFive();
    void taskSix();
}

interface AllInterfaces extends FirstInterface, SecondInterface, ThirdInterface {
    void finalTask();
}

class BaseClass {
    void showConcreteMethod() {
        System.out.println("This is a concrete class method.");
    }
}

class AllMethods extends BaseClass implements AllInterfaces {
    public void taskOne() {
        System.out.println("Executing Task One");
    }

    public void taskTwo() {
        System.out.println("Executing Task Two");
    }

    public void taskThree() {
        System.out.println("Executing Task Three");
    }

    public void taskFour() {
        System.out.println("Executing Task Four");
    }

    public void taskFive() {
        System.out.println("Executing Task Five");
    }

    public void taskSix() {
        System.out.println("Executing Task Six");
    }

    public void finalTask() {
        System.out.println("Executing Final Task");
    }
}
