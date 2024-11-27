package assignment2;

public class Question24 {
    public static void main(String[] args) {
        int candidateAge = 47;
        String candidateName = "Alice";

        try {
            if (candidateAge > 45) {
                throw new OverAgeException("Candidate is too old to apply.");
            } else if (candidateAge < 20) {
                throw new UnderAgeException("Candidate is too young to apply.");
            } else {
                System.out.println(candidateName + " is eligible for recruitment.");
            }
        } catch (OverAgeException | UnderAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}

class OverAgeException extends Exception {
    public OverAgeException(String message) {
        super(message);
    }
}

class UnderAgeException extends Exception {
    public UnderAgeException(String message) {
        super(message);
    }
}
