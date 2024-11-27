package assignment2;

public class Question10 {
    public static void main(String[] args) {
        Bus bus1 = new Bus("B123", 60, "Yellow", "Alice", "Route 5");
        Car car1 = new Car("C456", 150, "Black", "Bob", "Honda");

        bus1.showDetails();
        car1.showDetails();
    }
}

class Vehicle {
    protected String registrationNumber;
    protected int maxSpeed;
    protected String vehicleColor;
    protected String owner;

    Vehicle(String registrationNumber, int maxSpeed, String vehicleColor, String owner) {
        this.registrationNumber = registrationNumber;
        this.maxSpeed = maxSpeed;
        this.vehicleColor = vehicleColor;
        this.owner = owner;
    }

    void showDetails() {
        System.out.println("This is a general vehicle.");
    }
}

class Bus extends Vehicle {
    private String busRoute;

    Bus(String registrationNumber, int maxSpeed, String vehicleColor, String owner, String busRoute) {
        super(registrationNumber, maxSpeed, vehicleColor, owner);
        this.busRoute = busRoute;
    }

    void showDetails() {
        super.showDetails();  // Calls the method from the Vehicle class
        System.out.println("Bus Registration: " + registrationNumber + ", Speed: " + maxSpeed + " km/h, Color: " + vehicleColor + ", Owner: " + owner + ", Route: " + busRoute);
    }
}

class Car extends Vehicle {
    private String carManufacturer;

    Car(String registrationNumber, int maxSpeed, String vehicleColor, String owner, String carManufacturer) {
        super(registrationNumber, maxSpeed, vehicleColor, owner);
        this.carManufacturer = carManufacturer;
    }

    void showDetails() {
        super.showDetails();  // Calls the method from the Vehicle class
        System.out.println("Car Registration: " + registrationNumber + ", Speed: " + maxSpeed + " km/h, Color: " + vehicleColor + ", Owner: " + owner + ", Manufacturer: " + carManufacturer);
    }
}
