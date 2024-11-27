package assignment2;
import java.util.Scanner;

public class Question21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a country name:");
        String country = scanner.nextLine();

        try {
            String capital = findCapital(country);
            System.out.println("The capital of " + country + " is " + capital);
        } catch (NoMatchFoundException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }

    public static String findCapital(String country) throws NoMatchFoundException {
        if (country.equalsIgnoreCase("India")) {
            return "New Delhi";
        } else if (country.equalsIgnoreCase("USA")) {
            return "Washington D.C.";
        } else if (country.equalsIgnoreCase("Japan")) {
            return "Tokyo";
        } else if (country.equalsIgnoreCase("Australia")) {
            return "Canberra";
        } else {
            throw new NoMatchFoundException("Sorry, no capital found for " + country + ".");
        }
    }
}

class NoMatchFoundException extends Exception {
    public NoMatchFoundException(String message) {
        super(message);
    }
}

