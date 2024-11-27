package assignment1;
import java.util.Scanner;

public class Question_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number to be checked:");
        int number = sc.nextInt();
        
        System.out.println("Enter the divisor:");
        int divisor = sc.nextInt();
        
        if (divisor != 0) {
            if (number % divisor == 0) {
                System.out.println(number + " is divisible by " + divisor);
            } 
            else {
                System.out.println(number + " is not divisible by " + divisor);
            }
        } 
        else {
            System.out.println("Divisor cannot be zero.");
        }
        
        sc.close();
    }
}
