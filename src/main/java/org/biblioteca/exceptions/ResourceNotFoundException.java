package org.biblioteca.exceptions;

public class ResourceNotFoundException extends RuntimeException{

	public ResourceNotFoundException(String message){
		super(message);
	}

	@Override
	public String getMessage(){
		return super.getMessage();
	}

}
