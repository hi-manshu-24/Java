package assignment2;

public class Question12 {
    public static void main(String[] args) {
        Journey journey1 = new Journey(120);
        JourneyMetricSystem journey2 = new JourneyMetricSystem(120);

        journey1.calculateTime();
        journey2.calculateTime();
    }
}

class Journey {
    double distanceInMiles;

    Journey(double distanceInMiles) {
        this.distanceInMiles = distanceInMiles;
    }

    void calculateTime() {
        System.out.println("Time to cover the distance (in hours) with speed 60 mph: " + (distanceInMiles / 60));
    }
}

class JourneyMetricSystem extends Journey {
    JourneyMetricSystem(double distanceInKilometers) {
        super(distanceInKilometers);
    }

    void calculateTime() {
        System.out.println("Time to cover the distance (in hours) with speed 100 km/s: " + (distanceInMiles / 100));
    }
}
