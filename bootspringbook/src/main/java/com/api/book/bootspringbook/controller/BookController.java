package com.api.book.bootspringbook.controller;

import java.util.List;

import com.api.book.bootspringbook.entities.Books;
import com.api.book.bootspringbook.services.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller
 */
@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public List<Books> getBooks() {

        /*
         * Books book = new Books(); book.setId(123); book.setTitle("Java");
         * book.setAuthor("Venkatesh");
         */

        return this.bookService.getAllBooks();
    }

    @GetMapping("/books/{id}")
    public Books getBook(@PathVariable("id") int id) {
        return bookService.getBookById(id);
    }

    // create
    @PostMapping("/books")
    public Books addBooks(@RequestBody Books book) {
        Books b = this.bookService.addBooks(book);
        return b;
    }

    @DeleteMapping("/books/{bookid}")
    public void deleteBook(@PathVariable("bookid") int bookid) {
        this.bookService.deleteBook(bookid);
    }

    // update
    @PutMapping("books/{bookid}")
    public Books updateBooks(@RequestBody Books book, @PathVariable("bookid") int bookid) {
        this.bookService.updateBooks(book, bookid);
        return book;
    }

}