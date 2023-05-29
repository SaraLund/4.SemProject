package com.fynsantikvariat2.Controllers;

import com.fynsantikvariat2.Models.Book;
import com.fynsantikvariat2.Repos.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApiControllers {
    @Autowired
    private BookRepo bookRepo;

    /*public ApiControllers(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }*/

    @GetMapping(value="/")
    public String getPage(){
        return "Welcome";
    }

    @GetMapping(value = "/books")
    public List<Book> getBooks(){
        return bookRepo.findAll();
    }

    @PostMapping(value = "/save")
    public String saveBook(@RequestBody Book book){
        bookRepo.save(book);
        return "Saved...";
    }

    @PutMapping(value = "update/{id}")
    public String updateBook(@PathVariable long id, @RequestBody Book book){
        Book updatedBook = bookRepo.findById(id).get();
        updatedBook.setTitle(book.getTitle());
        updatedBook.setAuthorName(book.getAuthorName());
        updatedBook.setISBN(book.getISBN());
        updatedBook.setPrice(book.getPrice());
        bookRepo.save(updatedBook);
        return "Updated...";
    }

    @DeleteMapping(value = "delete/{id}")
    public String deleteBook(@PathVariable long id){
        Book deleteBook = bookRepo.findById(id).get();
        bookRepo.delete(deleteBook);
        return "Deleted book with this id: "+id;
    }
}
