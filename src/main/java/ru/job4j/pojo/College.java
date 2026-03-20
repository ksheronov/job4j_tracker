package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Ivan Ivanov");
        student.setAge(18);
        student.setDate(2026, 9, 1);
        System.out.println("Cтудент " + student.getFio()
                + " в возрасте " + student.getAge()
                + " был принят в институт " + student.getDate());
    }
}
