package com.studentproject.demo1.error;

public class StudentNotFounfException extends Exception{
	public StudentNotFounfException() {
		
	}
	
	public StudentNotFounfException(String Message,Throwable cuase) {
		
	}
	public StudentNotFounfException(Throwable Message) {
		
	}
	public StudentNotFounfException(String Message) {
		super(Message);
	}
}
