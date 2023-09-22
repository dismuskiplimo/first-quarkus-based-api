package com.limo;

import jakarta.ws.rs.Produces;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;

import java.util.ArrayList;
import java.util.List;

@Path("/books")
@Produces(MediaType.APPLICATION_JSON)
public class BookResource {
    List<Book> books;
    
    public BookResource(){
        books = new ArrayList<>();
        books.add(new Book("Dismus", 20));
        books.add(new Book("Ng'eno", 101));
        books.add(new Book("Sheila", 01));
    }
    
    @GET
    
    public List<Book> getAllBooks(){
        return books;
    }
}
