package assignment1;
import java.util.Scanner;

public class Question_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int number = 12; 
        int factorial = 1;
        
        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }
        
        System.out.println("Factorial of 12 is: "+factorial);
        
        sc.close();
    }
}

