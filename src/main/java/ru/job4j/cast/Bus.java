package ru.job4j.cast;

public class Bus implements Vehicle {

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " едет по дороге");
    }

    @Override
    public void passanger(int count) {
        System.out.println(getClass().getSimpleName() + " Количество пассажиров внутри = " + count);
    }
}
