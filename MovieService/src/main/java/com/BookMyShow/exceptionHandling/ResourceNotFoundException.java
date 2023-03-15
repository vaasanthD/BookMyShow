package com.BookMyShow.exceptionHandling;

public class ResourceNotFoundException extends RuntimeException {
	String source;
	String field;
	String fieldValue;

	public ResourceNotFoundException(String source,String field,String fieldValue) {
		super(String.format("%s is not available in %s:%s",source,field,fieldValue));
		this.source=source;
		this.field=field;
		this.fieldValue=fieldValue;
	}
	
}
