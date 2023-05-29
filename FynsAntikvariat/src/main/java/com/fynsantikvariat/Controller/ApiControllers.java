package com.fynsantikvariat.Controller;

import com.fynsantikvariat.Models.Book;
import com.fynsantikvariat.Repos.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApiControllers {
    private final BookRepo bookRepo;

    public ApiControllers(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    @GetMapping(value="/")
    public String getPage(){
        return "Welcome";
    }

    @GetMapping(value = "/books")
    public List<Book> getBooks(){

        return bookRepo.findAll();
    }

    /*@PostMapping(value = "/save")
    public String saveBook(@RequestBody Book book){
        BookRepo.save(book);

    }*Y
}
