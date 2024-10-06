package myproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import myproject.testBookProject.dto.Library;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
        // Создаем экземпляр библиотеки
        Library library = new Library();

        // Добавляем книгу в библиотеку
        library.addBookToLibraryFromScanner();

        // Можем получить список книг, чтобы убедиться, что книга добавлена
        System.out.println("Количество книг в библиотеке: " + library.getBooks().size());
    }
}
