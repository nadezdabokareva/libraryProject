package myproject.testBookProject.dto;

import myproject.testBookProject.entity.Book;
import myproject.testBookProject.entity.Reader;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
    private List<Book> books = new ArrayList<>();
    List<Reader> readers = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    // Метод для добавления книги в библиотеку
    public void addBookToLibrary(Book book) {
        if (book != null) {
            books.add(book);  // Добавляем книгу в список
            System.out.println("Книга \"" + book.getTitle() + "\" добавлена в библиотеку.");
        } else {
            System.out.println("Ошибка: нельзя добавить пустую книгу.");
        }
    }
    public void addBookToLibraryFromScanner() {
        System.out.println("Enter the book title:");
        String title = scanner.nextLine();

        System.out.println("Enter the book author:");
        String author = scanner.nextLine();

        System.out.println("Enter the ISBN:");
        String isbn = scanner.nextLine();

        Book book = new Book();
        book.setTitle(title);
        book.setAuthor(author);
        book.setISBN(isbn);
        book.setAvailable(true);

        books.add(book);
        System.out.println("Book \"" + title + "\" by " + author + " added to the library.");
    }

    // Дополнительно можно добавить методы для получения списка книг
    public List<Book> getBooks() {

        return books;
    }
    public void registryNewReader(Reader reader) {
        if (reader != null) {
            if (!readers.contains(reader)) {
                readers.add(reader);
                System.out.println("Читатель \"" + reader.getName() + "\" зарегистрирован.");
            } else {
                System.out.println("Ошибка: нельзя добавить пустого или уже существующего пользователя.");
            }
        }
    }

    public void bookGiveOut(){

    }
    public void arriveBookFromReader(){


}
}
