package assignment1;

import java.util.Scanner;

public class Question_29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Duplicate elements and their frequency: ");
        
        for (int i = 0; i < n; i++) {
            int count = 1;
            if (arr[i] != -1) {
                
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        arr[j] = -1;
                    }
                }
                
                if (count > 1) {
                    System.out.println(arr[i] + " occurs " + count + " times");
                }
            }
        }

        sc.close();
    }
}

