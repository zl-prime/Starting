package com.zlprime;

import com.zlprime.service.BookService;
import com.zlprime.service.impl.BookServiceImpl;

public class App {
    public static void main(String[] args) {
        BookService bookService = new BookServiceImpl();
        bookService.save();
    }
}
