package com.project1.Myapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.project1.Myapp.config.BeanConfig;
import com.project1.Myapp.config.service.MyappService;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        MyappService myapp = context.getBean(MyappService.class);

        String getDisplay = myapp.Display();
        System.out.println(getDisplay);
        System.out.println("hello");
        myapp.addBooks("Spring in Action");
        myapp.addBooks("Java");
        myapp.addBooks("Python");
        myapp.getBookDetails().forEach(System.out::println);
    }
}

