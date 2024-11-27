package assignment2;

public class Question26 {
    public static void main(String[] args) {
        String personName = "Alice";
        int personAge = -2;

        try {
            if (personAge < 0) {
                throw new InvalidAgeException("Age cannot be a negative value.");
            } else {
                System.out.println("The person " + personName + " is " + personAge + " years old.");
            }
        } catch (InvalidAgeException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String msg) {
        super(msg);
    }
}
