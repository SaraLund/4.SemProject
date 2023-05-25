package com.fynsantikvariat.Repos;

import com.fynsantikvariat.Models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book, Long> {

}
