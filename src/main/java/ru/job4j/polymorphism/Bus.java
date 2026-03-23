package ru.job4j.polymorphism;

public class Bus implements Transport {
    @Override
    public void move() {
        System.out.println("Автобус начал движение");
    }

    @Override
    public void passengers(int count) {
        System.out.println("В автобусе " + count + " пассажиров");
    }

    @Override
    public int refuel(int fuel) {
        int price = fuel * 40;
        System.out.println("заправлено " + fuel + " литров на " + price + " рублей");
        return price;
    }
}
