package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Azbuka", 200);
        Book book2 = new Book("Комикс", 50);
        Book book3 = new Book("Bable", 600);
        Book book4 = new Book("Clean code", 1000);
        Book[] books = new Book[]{book1, book2, book3, book4};
        for (Book book : books) {
            System.out.println("Название книги - " + book.getName() + " в ней " + book.getPages() + " страниц.");
        }
        System.out.println("Перестановка книг с индексом 0 и 3");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (Book book : books) {
            System.out.println("Название книги - " + book.getName() + " в ней " + book.getPages() + " страниц.");
        }
        System.out.println("Вывод книги Clean code");
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            if ("Clean code".equals(book.getName())) {
                System.out.println("Название книги - " + book.getName() + " она " + i + " в массиве");
            }
        }
    }
}
