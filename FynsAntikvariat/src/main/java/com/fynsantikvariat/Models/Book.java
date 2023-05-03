package com.fynsantikvariat.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Book {

    @Id
    @GeneratedValue
    private Integer BookId;
    @Column
    private String ISBN;
    @Column
    private String AuthorName;
    @Column
    private double Price;

    public Book(int bookId, String ISBN, String authorName, double price){
        this.BookId = bookId;
        this.ISBN = ISBN;
        this.AuthorName = authorName;
        this.Price = price;
    }

    public Book() {

    }


    public String toString(){
        return "Book [id=" + BookId + ", ISBN=" + ISBN + ", AuthorName=" + AuthorName + ", Price=" + Price + "]";
    }

    public Integer getBookId() {
        return BookId;
    }

    public void setBookId(Integer bookId) {
        BookId = bookId;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAuthorName() {
        return AuthorName;
    }

    public void setAuthorName(String authorName) {
        AuthorName = authorName;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }
}
