package assignment1;
import java.util.Scanner;

class Commission {
    private double sales;

    public Commission(double sales) {
        if (sales < 0) {
            System.out.println("Invalid Input");
            this.sales = 0;
        } 
        else {
            this.sales = sales;
        }
    }

    public double calculateCommission() {
        return sales * 0.1;
    }
}

public class Question_33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter sales amount: ");
        double sales = sc.nextDouble();

        Commission commissionObj = new Commission(sales);

        if (sales >= 0) {
            System.out.println("Commission: " + commissionObj.calculateCommission());
        } 
        else {
            System.out.println("Commission not calculated due to invalid input.");
        }

        sc.close();
    }
}
