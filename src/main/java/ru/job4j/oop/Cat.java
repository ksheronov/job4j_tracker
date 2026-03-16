package ru.job4j.oop;

public class Cat {

    private String food;
    private String name;

    void show() {
        System.out.println("This cat name " + this.name + " and it eat " + this.food);
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public String sound() {
        return "may-may";
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public static void main(String[] args) {
        Cat peppy = new Cat();
        Cat sparky = new Cat();
        String say = peppy.sound();
        System.out.println("Peppy says " + say);
        System.out.println("Sparky says " + sparky.sound());
        Cat gav = new Cat();
        gav.giveNick("Gav");
        gav.eat("cutlet");
        gav.show();
        Cat black = new Cat();
        black.giveNick("Black");
        black.eat("fish");
        black.show();
    }
}
