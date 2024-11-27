package assignment2;

public class Question25 {
    public static void main(String[] args) {
        String user = "john";
        String pass = "hello123";
        String confirmPass = "hello124";

        try {
            if (user.length() < 6) {
                throw new ShortUsernameException("Username must be at least 6 characters.");
            }
            if (!pass.equals(confirmPass)) {
                throw new PasswordMismatch("The passwords do not match.");
            }
        } catch (ShortUsernameException | PasswordMismatch e) {
            System.out.println(e.getMessage());
        }
    }
}

class ShortUsernameException extends Exception {
    public ShortUsernameException(String message) {
        super(message);
    }
}

class PasswordMismatch extends Exception {
    public PasswordMismatch(String message) {
        super(message);
    }
}
