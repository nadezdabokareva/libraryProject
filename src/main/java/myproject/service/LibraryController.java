package myproject.service;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import myproject.dto.Library;
import myproject.entity.Book;
import myproject.entity.Reader;

@Controller
public class LibraryController {
    private Library library = new Library();

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("books", library.getBooks()); // Предполагается, что у вас есть метод для получения списка книг
        return "index"; // Имя HTML файла
    }

    @PostMapping("/addBook")
    public String addBook(@RequestParam String title, @RequestParam String author) {
        Book newBook = new Book(title, author, "123456", true); // Используйте корректный ISBN
        library.addBookToLibrary(newBook);
        return "redirect:/"; // Перенаправление на главную страницу
    }

    @PostMapping("/registerReader")
    public String registerReader(@RequestParam String name) {
        Reader newReader = new Reader(name);
        library.registryNewReader(newReader); // Метод регистрации читателя
        return "redirect:/"; // Перенаправление на главную страницу
    }
}
