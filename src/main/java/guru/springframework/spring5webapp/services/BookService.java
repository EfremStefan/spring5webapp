package guru.springframework.spring5webapp.services;

import guru.springframework.spring5webapp.models.Book;
import guru.springframework.spring5webapp.repositories.BookRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooks(){
        return new ArrayList<>((Collection<Book>) bookRepository.findAll());
    }
}
