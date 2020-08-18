package com.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.model.Book;

@Service
public interface BookService {

	public long save(Book book);

	public Book get(long id);

	public List<Book> list();

	public void update(long id, Book book);

	public void delete(long id);

}
