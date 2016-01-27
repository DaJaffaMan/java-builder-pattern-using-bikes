package bike_builder;

public enum BikeType {
    UNICYCLE(1), BICYCLE(2), TRICYCLE(3), QUADRICYCLE(4);

    private int numberOfWheels;

    BikeType(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }
}
