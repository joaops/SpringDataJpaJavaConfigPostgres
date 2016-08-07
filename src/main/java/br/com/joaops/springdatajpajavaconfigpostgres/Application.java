/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.joaops.springdatajpajavaconfigpostgres;

import br.com.joaops.springdatajpajavaconfigpostgres.configuration.DataConfiguration;
import br.com.joaops.springdatajpajavaconfigpostgres.model.Book;
import br.com.joaops.springdatajpajavaconfigpostgres.service.BookService;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author João
 */
public class Application {
    
    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DataConfiguration.class)) {
            BookService service = context.getBean(BookService.class);
            Book book = new Book("First Book", new Date(), 33, new BigDecimal(29.90));
            service.save(book);
            List<Book> books = service.findAll();
            for (Book b : books) {
                System.out.println(b);
            }
        }
    }
    
}