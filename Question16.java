package assignment2;

public class Question16 {
    public static void main(String[] args) {
        new Workers();
        new Workers();
        new Workers();

        Workers.showTotalWorkers();
    }
}

class Workers {
    static int totalWorkers = 0;

    Workers() {
        totalWorkers++;
    }

    // Static method
    static void showTotalWorkers() {
        System.out.println("Total workers created: " + totalWorkers);
    }
}
