package assignment1;

import java.util.Scanner;
import java.util.Arrays;

public class Question_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);
        
        double median;
        
        if (n % 2 == 0) {
            median = (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
        } 
        else {
            median = arr[n / 2];
        }
        
        System.out.println("Median: " + median);
        
        sc.close();
    }
}

