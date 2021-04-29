package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Azbuka", 100);
        Book book2 = new Book("Java", 1000);
        Book book3 = new Book("Clean code", 800);
        Book book4 = new Book("Bible", 1500);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        for (Book bk : books) {
            System.out.println("Книга: " + bk.getName() + ", Количество страниц: " + bk.getPages());
        }
        Book tmp = books[0];
        books[0] = books[3];
        books[3] = tmp;
        System.out.println("Перестановка элементов:");
        for (Book bk : books) {
            System.out.println("Книга: " + bk.getName() + ", Количество страниц: " + bk.getPages());
        }
        System.out.println("Вывод книги Clean code: ");
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            if ("Clean code".equals(bk.getName())) {
                System.out.println("Номер книги в массиве: " + i
                        + System.lineSeparator()
                        + "Книга: " + bk.getName() + " количестов страниц: " + bk.getPages());
            }
        }
    }
}
