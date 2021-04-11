package ru.job4j.oop;

public class Cat {
    private String food;
    private String name;

    public String sound() {
        return "may-may";
    }

    public void show() {
        System.out.println("Cat name - " + this.name);
        System.out.println("Cat food - " + this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public static void main(String[] args) {
        Cat gav = new Cat();
        gav.eat("kotleta");
        gav.giveNick("Gav");
        gav.show();
        Cat black = new Cat();
        black.eat("fish");
        black.giveNick("Black");
        black.show();
    }
}
