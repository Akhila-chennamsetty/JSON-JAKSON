package com.springrest.JSON_JASKSON;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.springrest.binding.Author;
import com.springrest.binding.Book;

public class App {
    public static void main(String[] args) throws Exception {
        
    	Author author = new Author();
    	author.setName("James");
    	author.setEmail("james@123");
    	author.setPhno(868686861);
    	
    	Book book = new Book();
    	book.setId(101);
    	book.setName("JAVA");
    	book.setPrice(500.00);
    	book.setAuthor(author);
    	
    	ObjectMapper mapper = new ObjectMapper();
    	//converting Java object to JSON and store it in a file
    	mapper.writeValue(new File("book.json"),book);
    	System.out.println("conversion completed");
    }
}
