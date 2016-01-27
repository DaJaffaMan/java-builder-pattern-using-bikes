package bike_builder;

import static bike_builder.Bike.BikeBuilder;

public class App {
    public static void main(String[] args) {
        Bike bike = new BikeBuilder().withBikeTypeAs(BikeType.UNICYCLE).build();
    }
}
