package com.myapp.unsij.service;

import com.myapp.unsij.entity.Book;
import com.myapp.unsij.entity.Tag;
import com.myapp.unsij.repository.BookRepository;
import com.myapp.unsij.repository.TagRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

@Slf4j
@Service
public class BookService {
    private final BookRepository repository;
    private final TagRepository tagRepository;

    public BookService(BookRepository repository, TagRepository tagRepository) {
        this.repository = repository;
        this.tagRepository = tagRepository;
    }

    public List<Book> findAllByTags(Set<String> tags){
        Set<Tag> tagList = new HashSet<>();
        for(String tagName: tags){
            tagList.add(tagRepository.findByName(tagName));
        }
        log.info("TagList:" + tagList.toString());

        return repository.findAllByTagsIn(tagList);

    }


    public Book save(Book book) {
        return repository.save(book);
    }
}
