package assignment2;

public class Question7 {
    public static void main(String[] args) {
        Student student = new Student();
        student.show(); 
    }
}

class Teacher {
    void show() {
        System.out.println("This is the teacher class.");
    }
}

class Student extends Teacher {
    void show() {
        System.out.println("This is the student class.");
    }
}

