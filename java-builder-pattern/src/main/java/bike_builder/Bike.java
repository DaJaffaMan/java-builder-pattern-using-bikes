package bike_builder;

public class Bike {

    private int numberOfWheels;

    public Bike(BikeBuilder bikeBuilder) {

    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    class BikeBuilder {

        private int numberOfWheels;

        public void withNumberOfWheels(int numberOfWheels) {
            this.numberOfWheels = numberOfWheels;
        }

        public Bike build() {
            return new Bike(this);
        }

    }
}
