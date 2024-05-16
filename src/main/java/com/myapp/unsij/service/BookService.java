package com.myapp.unsij.service;

import com.myapp.unsij.entity.Book;
import com.myapp.unsij.entity.Tag;
import com.myapp.unsij.repository.BookRepository;
import com.myapp.unsij.repository.TagRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Slf4j
@Service
public class BookService {
    private final BookRepository repository;
    private final TagRepository tagRepository;

    @Autowired
    public BookService(BookRepository repository, TagRepository tagRepository) {
        this.repository = repository;
        this.tagRepository = tagRepository;
    }

    public List<Book> findAllByTags(Set<String> tags){
        Set<Tag> tagList = new HashSet<>();
        for(String tagName: tags){
            tagList.add(tagRepository.findByName(tagName));
        }

        tags.forEach(log::info);

        return repository.findAllByTagsIn(tagList);

    }


    public Book save(Book book) {
        return repository.save(book);
    }

    public Book updateBook(Book book) {
        return repository.save(book);
    }

    public List<Book> findAll() {
        return repository.findAll();
    }

    public void deleteBook(Long bookId) {
        Optional<Book> book = repository.findById(bookId);
        if(book.isPresent()){
            repository.delete(book.get());
        }
    }
}
