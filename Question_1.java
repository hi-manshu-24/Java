package assignment1;
import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Choose the conversion type:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        
        int choice = scanner.nextInt();
        
        System.out.println("Enter the temperature:");
        double temp = scanner.nextDouble();
        
        switch (choice) {
            case 1:
                double fahrenheit = (temp * 9 / 5) + 32;
                System.out.println(temp + "° Celsius is equal to " + fahrenheit + "° Fahrenheit.");
                break;
            case 2:
                double celsius = (temp - 32) * 5 / 9;
                System.out.println(temp + "° Fahrenheit is equal to " + celsius + "° Celsius.");
                break;
            default:
                System.out.println("Invalid choice! Please enter 1 or 2.");
                break;
        }

        scanner.close();
    }
}
