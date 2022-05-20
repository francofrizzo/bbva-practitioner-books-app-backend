package bbvaPractitioner.bookappbackend.controllers;

import bbvaPractitioner.bookappbackend.entities.Book;
import bbvaPractitioner.bookappbackend.repositories.BookRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    private BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping
    public List<Book> getBookList() {
        return this.bookRepository.findAll();
    }
}
