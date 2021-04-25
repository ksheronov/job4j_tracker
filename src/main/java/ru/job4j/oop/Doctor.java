package ru.job4j.oop;

public class Doctor extends Profession {
    private int grade;

    public Doctor(String name, String surname, String birthday, String education, int grade) {
        super(name, surname, birthday, education);
        this.grade = grade;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public Diagnosis heal(Pacient pacient) {
        return heal(pacient);
    }
}
