package ru.job4j.ooa;

public class Airport {
    public static void main(String[] args) {
        final Airbus AIRBUS = new Airbus("A320");
        System.out.println(AIRBUS);
        AIRBUS.printModel();
        AIRBUS.printCountEngine();
        Airbus airbus = new Airbus("A380");
        System.out.println(airbus);
        airbus.printModel();
        airbus.printCountEngine();
        airbus = new Airbus("IL76");
        System.out.println(airbus);
        airbus.printCountEngine();
        AIRBUS.setName("Boing");
        System.out.println(AIRBUS);
    }
}
