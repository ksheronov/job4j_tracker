package ru.job4j.oop;

public class Doctor extends Profession {
    private int grade;

    public Doctor() {
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public Diagnosis heal(Pacient pacient) {
        return heal(pacient);
    }
}
