package com.zlprime;

import com.zlprime.dao.BookDao;
import com.zlprime.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.print.Book;

public class App2 {
    public static void main(String[] args) {
        //3.获取IOC容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //4.获取Bean
        BookService bookService = (BookService) applicationContext.getBean("bookService");
        bookService.save();
    }
}
