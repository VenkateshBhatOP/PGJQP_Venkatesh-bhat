package com.api.book.bootspringbook.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.api.book.bootspringbook.entities.Books;

import org.springframework.stereotype.Service;

@Service
public class BookService {
    private static List<Books> list = new ArrayList<>();

    static {
        list.add(new Books(11, "Java complete guide", "abc"));
        list.add(new Books(21, "Head first java", "def"));
        list.add(new Books(31, "Think wise", "xyz"));
    }

    // get all books
    public List<Books> getAllBooks() {

        return list;

    }

    // get a single book

    public Books getBookById(int id) {

        Books book = null;
        book = list.stream().filter(e -> e.getId() == id).findFirst().get();
        return book;
    }

    // add books

    public Books addBooks(Books b) {
        list.add(b);

        return b;
    }

    // delete

    public void deleteBook(int bid) {
        list = list.stream().filter(book -> book.getId() != bid).collect(Collectors.toList());
    }

    // update

    public void updateBooks(Books book, int bookid) {
        list.stream().map(b -> {
            if (b.getId() == bookid) {
                b.setTitle(book.getTitle());
                b.setAuthor(book.getAuthor());
            }
            return b;
        }).collect(Collectors.toList());

    }

}
