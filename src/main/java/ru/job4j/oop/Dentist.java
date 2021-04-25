package ru.job4j.oop;

public class Dentist extends Doctor {
    public Dentist(String name, String surname, String birthday, String education, int grade) {
        super(name, surname, birthday, education, grade);
    }

    public void operation(Pacient pacient, Diagnosis heal) {
    }

}
