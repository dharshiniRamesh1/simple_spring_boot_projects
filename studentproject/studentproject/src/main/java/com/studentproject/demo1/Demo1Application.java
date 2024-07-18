package com.studentproject.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


class CustomException extends Exception{
	public CustomException() {
		
	}
	public  CustomException(String message) {
		super(message);
	}
}
@SpringBootApplication
public class Demo1Application {

    public static void main(String[] args)throws CustomException {
        SpringApplication.run(Demo1Application.class, args);
        int age=17;
        if(age<20) {
        	throw new CustomException("invalid age");
        }
        else {
        	System.out.print("voting function");
        }
    }
}
