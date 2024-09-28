package com.SpringbootApp.exception;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND  )
public class ResourceNotFoundeException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	private String resourceName;
	private String firstname;
	private Object fieldvalue;
	
	public ResourceNotFoundeException(String resourceName, String firstname, Object fieldvalue) {
		super( String.format("%s not found with %s : '%s' ",resourceName,firstname,fieldvalue) );
		this.resourceName = resourceName;
		this.firstname = firstname;
		this.fieldvalue = fieldvalue;
	}
	
	public String getResourceName() {
		return resourceName;
	}
	
	public String getFirstname() {
		return firstname;
	}
	
	public Object getFieldvalue() {
		return fieldvalue;
	}


}
