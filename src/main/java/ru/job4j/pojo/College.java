package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student stunent = new Student();
        stunent.setFio("Ivan Ivanov");
        stunent.setGroup("DKO-102");
        stunent.setDate(new Date());
        System.out.println("Студент " + stunent.getFio() + " учится в группе: "
                + stunent.getGroup() + " C даты: " + stunent.getDate());
    }
}
