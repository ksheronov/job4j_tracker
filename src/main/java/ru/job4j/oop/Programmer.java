package ru.job4j.oop;

public class Programmer extends Engineer {
    private String progLang;
    private String grade;

    public Programmer(String progLang, String grade) {
        this.progLang = progLang;
        this.grade = grade;
    }

    public Programmer(String name, String surname, String birthday, String education,
                      String progLang, String grade) {
        super(name, surname, birthday, education);
        this.progLang = progLang;
        this.grade = grade;
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
