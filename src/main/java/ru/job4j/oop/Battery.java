package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public void exchange(Battery another) {
        another.load += this.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery bat1 = new Battery(20);
        Battery bat2 = new Battery(5);
        System.out.println("Battery1 " + bat1.load);
        System.out.println("Battery2 " + bat2.load);
        bat1.exchange(bat2);
        System.out.println(bat1.load);
        System.out.println(bat2.load);
    }
}
