package assignment1;
import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        
        if (n > 0) {
            System.out.println(n + " is Positive");
        } 
        else if (n < 0) {
            System.out.println(n + " is Negative");
        } 
        else {
            System.out.println(n + " is Zero");
        }
        sc.close();
    }
}

