package com.bridgelabz;

/**
 * We have created our custom exception. 
 *   We have used Inheritance and extended the Exception class.
 *  We have declared tro variable message and exception type.
 *  We have created a enum and declared 2 enum as null and empty
 *  Then we have created the constructor and passed the message and the enum type.
 * @author Tom
 *
 */
public class MoodAnalyzerException extends Exception {
	public String message;
	public ExceptionType exceptionType;
	
	enum ExceptionType{
		ENTERED_NULL,ENTERED_EMPTY;
	}

	public MoodAnalyzerException(String message, ExceptionType exceptiontype) {
		super();
		this.message = message;
		this.exceptionType = exceptiontype;
	}
  
  
}
