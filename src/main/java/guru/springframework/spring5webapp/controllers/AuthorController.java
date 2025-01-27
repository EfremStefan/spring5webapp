package guru.springframework.spring5webapp.controllers;


import guru.springframework.spring5webapp.services.AuthorService;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AuthorController {

    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @RequestMapping(value = "/authors", method = RequestMethod.GET)
    public String getAuthors(Model model){
        model.addAttribute("authors", authorService.getAuthors());
        return "authors/list";
    }
}
