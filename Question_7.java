package assignment1;
import java.util.Scanner;

public class Question_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the percentage:");
        double percentage = sc.nextDouble();
        
        if (percentage >= 90) {
            System.out.println("Grade A");
        } 
        else if (percentage >= 80) {
            System.out.println("Grade B");
        } 
        else if (percentage >= 70) {
            System.out.println("Grade C");
        } 
        else if (percentage >= 60) {
            System.out.println("Grade D");
        } 
        else if (percentage >= 40) {
            System.out.println("Grade E");
        } 
        else {
            System.out.println("Grade F");
        }
        
        sc.close();
    }
}
