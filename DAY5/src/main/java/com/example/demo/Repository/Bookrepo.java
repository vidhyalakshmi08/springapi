package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Book;

public interface Bookrepo extends JpaRepository<Book,Integer>{

}
