package ru.job4j.cast;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle bus1 = new Bus();
        Vehicle bus2 = new Bus();
        Vehicle train = new Train();
        Vehicle train2 = new Train();
        Vehicle airplane = new Airplane();
        Vehicle airplane2 = new Airplane();
        Vehicle[] vehicles = new Vehicle[]{bus1, bus2, train, train2, airplane, airplane2};
        for (Vehicle vehicle : vehicles) {
            vehicle.move();
            vehicle.passanger(15);
        }
    }
}
