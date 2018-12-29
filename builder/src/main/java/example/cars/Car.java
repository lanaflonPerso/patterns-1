package example.cars;

import example.builders.Engine;
import example.builders.GpsNavigator;
import example.builders.Transmission;
import example.builders.TripComputer;
import lombok.Getter;

@Getter
public class Car {
    private final Type type;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GpsNavigator gpsNavigator;
    private double fuel = 0;

    public Car(Type type, int seats, Engine engine,
               Transmission transmission, TripComputer tripComputer,
               GpsNavigator gpsNavigator) {
        this.type = type;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.tripComputer.setCar(this);
        this.gpsNavigator = gpsNavigator;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }
}
