package assignment1;
import java.util.Scanner;

public class Question_19 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please Enter a number: ");
        int num = sc.nextInt();
        
        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome");
        } else {
            System.out.println(num + " is not a palindrome");
        }
        
        sc.close();
    }

    public static boolean isPalindrome(int number) {
        int original = number;
        int reversed = 0;
        
        while (number != 0) {
            int remainder = number % 10;
            reversed = reversed * 10 + remainder;
            number = number / 10;
        }
        
        return original == reversed;
    }
}

