package com.fynsantikvariat2.Repos;

import com.fynsantikvariat2.Models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book, Long> {
}
