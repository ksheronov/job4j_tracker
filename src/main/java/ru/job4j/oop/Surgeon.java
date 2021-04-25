package ru.job4j.oop;

public class Surgeon extends Doctor {
    public Surgeon(String name, String surname, String birthday, String education, int grade) {
        super(name, surname, birthday, education, grade);
    }

    public void operation(Pacient pacient, Diagnosis heal) {
    }

}
