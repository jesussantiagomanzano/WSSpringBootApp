package com.myapp.unsij.service;

import com.myapp.unsij.entity.Book;
import com.myapp.unsij.entity.Tag;
import com.myapp.unsij.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.List;


@Service
public class BookService {
    private final BookRepository repository;

    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    public List<Book> findAllByTags(Set<String> tags){
        return repository.findAllByTags(tags);

    }


    public Book save(Book book) {
        return repository.save(book);
    }
}
