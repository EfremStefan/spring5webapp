package guru.springframework.spring5webapp.services;

import guru.springframework.spring5webapp.models.Author;
import guru.springframework.spring5webapp.repositories.AuthorRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public List<Author> getAuthors(){
        return new ArrayList<>((Collection<Author>) authorRepository.findAll());
    }
}
