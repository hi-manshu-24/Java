package assignment1;
import java.util.Scanner;

public class Question_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter marks for Math, Physics, and Chemistry:");
        int math = sc.nextInt();
        int physics = sc.nextInt();
        int chemistry = sc.nextInt();
        
        int total = math + physics + chemistry;
        
        if (math >= 60 && physics >= 50 && chemistry >= 40 && total >= 200) {
            System.out.println("Eligible");
        } 
        else if (math + physics >= 150) {
            System.out.println("Eligible");
        } 
        else {
            System.out.println("Not Eligible");
        }
        
        sc.close();
    }
}

