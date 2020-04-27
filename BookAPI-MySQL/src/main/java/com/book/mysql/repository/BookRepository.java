package com.book.mysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.book.mysql.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>
{

}
