package ru.job4j.cast;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " едет по рельсам");
    }

    @Override
    public void passanger(int count) {
        System.out.println(getClass().getSimpleName() + " Количество пассажиров внутри = " + count);
    }
}
