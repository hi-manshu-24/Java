package assignment2;

public class Question23 {
    public static void main(String[] args) {
        int temp = 40;

        try {
            if (temp > 35) {
                throw new HotTemperatureException("Temperature is too high!");
            } else if (temp < 5) {
                throw new ColdTemperatureException("Temperature is too low!");
            } else {
                System.out.println("Temperature is normal.");
                double fahrenheit = temp * 9.0 / 5 + 32;
                System.out.println("In Fahrenheit: " + fahrenheit);
            }
        } catch (HotTemperatureException | ColdTemperatureException e) {
            System.out.println(e.getMessage());
        }
    }
}

class HotTemperatureException extends Exception {
    public HotTemperatureException(String message) {
        super(message);
    }
}

class ColdTemperatureException extends Exception {
    public ColdTemperatureException(String message) {
        super(message);
    }
}
