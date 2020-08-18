package Lesson13.Ex3;

public class Vehicle {

    protected String licensePlate;
    public Vehicle(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    @Override
    public String toString() {
        return "Vehicle{licensePlate = " + licensePlate+"}";
    }
}
