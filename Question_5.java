package assignment1;
import java.util.Scanner;

public class Question_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter distance in miles:");
        double miles = sc.nextDouble();
        
        double kilometers = miles * 1.60934;
        System.out.println(miles + " miles is " + kilometers + " kilometers.");
        
        sc.close();
    }
}

