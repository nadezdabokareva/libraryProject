package myproject.service;

import ch.qos.logback.core.model.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class LibraryController {
    @GetMapping("/")
    public String index(Model model) {
        // Добавьте логику для передачи данных в шаблон
        return "index"; // имя HTML-шаблона
    }
}
