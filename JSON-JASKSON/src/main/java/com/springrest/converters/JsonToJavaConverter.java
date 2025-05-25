package com.springrest.converters;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.springrest.binding.Book;

public class JsonToJavaConverter {

	public static void main(String[] args) throws Exception
	{	
		ObjectMapper mapper = new ObjectMapper();
		//converts JSON data to java object 
		Book book =mapper.readValue(new File("book.json"),Book.class);
		System.out.println(book);
		

	}

}
