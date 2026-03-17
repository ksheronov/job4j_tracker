package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int a) {
        return a - x;
    }

    public int devide(int a) {
        return a / x;
    }

    public int sumAllOperation(int a) {
        return sum(a) + multiply(a) + minus(a) + devide(a);
    }

    public static void main(String[] args) {
        int result = Calculator.sum(10);
        Calculator calculator = new Calculator();
        System.out.println(result);
        result = calculator.multiply(5);
        System.out.println(result);
        System.out.println("Number - x = " + minus(30));
        System.out.println("Number / x = " + calculator.devide(30));
        System.out.println("All Sum = " + calculator.sumAllOperation(10));
    }
}
