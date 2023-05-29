package com.fynsantikvariat2.Models;

import jakarta.persistence.*;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long BookId;
    @Column
    private String ISBN;
    @Column
    private String Title;
    @Column
    private String Authorname;
    @Column
    private double Price;

    public long getBookId() {
        return BookId;
    }

    public void setBookId(long bookId) {
        BookId = bookId;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getAuthorName() {
        return Authorname;
    }

    public void setAuthorName(String authorName) {
        Authorname = authorName;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }
}
