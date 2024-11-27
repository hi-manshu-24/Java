package assignment1;

import java.util.Scanner;
import java.util.Arrays;

public class Question_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number of elements ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        System.out.println("Enter the elements ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);
        
        System.out.println("Smallest number " + arr[0]);
        
        sc.close();
    }
}

