/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.joaops.springdatajpajavaconfigpostgres.service;

import br.com.joaops.springdatajpajavaconfigpostgres.model.Book;
import br.com.joaops.springdatajpajavaconfigpostgres.repository.BookRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author João
 */
@Service
public class BookService {
    
    @Autowired
    private BookRepository repo;
    
    public void save(Book book) {
        this.repo.save(book);
    }
    
    public List<Book> findAll() {
        return this.repo.findAll();
    }
    
}