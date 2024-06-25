package BehavioralDesignPattern.IteratorDesignPattern.BooksAndLibrary;

import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Book> bookList = Arrays.asList(
            new Book(100, "Science"),
            new Book(200, "Math"),
            new Book(300, "GK"),
            new Book(400, "English")
        );

        Library lib = new Library(bookList);
        Iterator iterator = lib.createIterator();

        while (iterator.hasNext()) {
            Book book = (Book)iterator.next();
            System.out.println("Book Name: " + book.getBookName() + ", Book Price: " + book.getPrice());
        }

    }
}
