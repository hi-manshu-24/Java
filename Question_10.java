package assignment1;
import java.util.Scanner;

public class Question_10 {
    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        
        System.out.println("Fibonacci of " + n + " is: " + fibonacci(n));
        
        sc.close();
    }
}

