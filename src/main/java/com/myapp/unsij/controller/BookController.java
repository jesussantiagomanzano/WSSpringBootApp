package com.myapp.unsij.controller;

import com.myapp.unsij.entity.Book;
import com.myapp.unsij.entity.Tag;
import com.myapp.unsij.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@CrossOrigin(value = "*")
@RestController
@RequestMapping(value = "book")
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    public Book saveBook(@RequestBody Book book){
        return bookService.save(book);
    }

    @GetMapping("/findByTags")
    public List<Book> findBookByTag(@RequestBody Set<String> tags){
        return bookService.findAllByTags(tags);
    }

    @PutMapping
    public Book updateBook(@RequestBody Book book){
        return bookService.updateBook(book);
    }


    @GetMapping
    public List<Book> findAllBooks(){
        return bookService.findAll();
    }

    @DeleteMapping("/delete/{bookId}")
    public String deleteBook(@PathVariable Long bookId) {
        bookService.deleteBook(bookId);
        return "Book deleted";
    }


}
