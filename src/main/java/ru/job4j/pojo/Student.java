package ru.job4j.pojo;

import java.time.LocalDate;

public class Student {
    private String fio;
    private int age;
    private LocalDate date;

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(int year, int month, int dayOfMonth) {
        this.date = LocalDate.of(year, month, dayOfMonth);
    }
}
