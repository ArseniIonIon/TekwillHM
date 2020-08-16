package Lesson13.Ex3;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("ABC123",4);
        Vehicle vehicle = new Vehicle("ABC123");

        System.out.println(car.toString());
        System.out.println(vehicle.toString());
    }
}
