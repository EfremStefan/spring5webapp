package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.services.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/books")
    public String getBooks(Model model){

        model.addAttribute("books", bookService.getAllBooks());
        return "books/list";
    }
}
