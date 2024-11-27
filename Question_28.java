package assignment1;
import java.util.Scanner;

public class Question_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                
                sum = sum + arr[i];
            }
        }
        
        System.out.println("Sum of odd numbers " + sum);
        
        sc.close();
    }
}
