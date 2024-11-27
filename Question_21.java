package assignment1;

import java.util.Scanner;

public class Question_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a decimal number: ");
        int decimal = sc.nextInt();
        String binary = Integer.toBinaryString(decimal);
        System.out.println("Binary: " + binary);
        
        System.out.println("Enter a binary number: ");
        String binaryInput = sc.next();
        int decimalEquivalent = Integer.parseInt(binaryInput, 2);
        System.out.println("Decimal: " + decimalEquivalent);
        
        sc.close();
    }
}

