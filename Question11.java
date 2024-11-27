package assignment2;

public class Question11 {
    public static void main(String[] args) {
        Number num1 = new Number(56);
        AdvancedNumber num2 = new AdvancedNumber(56);

        num1.displayNum();
        num2.displayNum();
    }
}

class Number {
    int value;

    Number(int value) {
        this.value = value;
    }

    void displayNum() {
        System.out.println("Decimal Value: " + value);
    }
}

class AdvancedNumber extends Number {
    AdvancedNumber(int value) {
        super(value);
    }

    void displayNum() {
        System.out.println("Hexadecimal: " + Integer.toHexString(value));
        System.out.println("Octal: " + Integer.toOctalString(value));
    }
}

