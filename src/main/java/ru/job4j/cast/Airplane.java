package ru.job4j.cast;

public class Airplane implements Vehicle {

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " летит апо небу");
    }

    @Override
    public void passanger(int count) {
        System.out.println(getClass().getSimpleName() + " Количество пассажиров внутри = " + count);
    }
}
