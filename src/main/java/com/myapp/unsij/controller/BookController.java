package com.myapp.unsij.controller;

import com.myapp.unsij.entity.Book;
import com.myapp.unsij.entity.Tag;
import com.myapp.unsij.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping(value = "book")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public Book saveBook(@RequestBody Book book){
        return bookService.save(book);
    }


    @GetMapping("/findByTags")
    public List<Book> findBookByTag(@RequestBody Set<String> tags){
        return bookService.findAllByTags(tags);
    }

}
