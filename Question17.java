package assignment2;

public class Question17 {
    public static void main(String[] args) {
        int number = 2415;
        String numStr = Integer.toString(number);
        int total = 0;

        for (int i = 0; i < numStr.length() - 1; i++) {
            String pair = numStr.substring(i, i + 2);
            int value = Integer.parseInt(pair);
            total += value;
        }

        System.out.println("The sum of consecutive numbers is: " + total);
    }
}

