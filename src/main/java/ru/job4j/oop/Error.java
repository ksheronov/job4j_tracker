package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Состояние ошибки: " + active);
        System.out.println("Статуc ошибки: " + status);
        System.out.println("Текст ошибки: " + message);
        System.out.println();
    }

    public static void main(String[] args) {
        Error error1 = new Error();
        Error error2 = new Error(true, 1, "Системная ошибка");
        Error error3 = new Error(true, 404, "Page not found");
        error1.printInfo();
        error2.printInfo();
        error3.printInfo();
    }
}
