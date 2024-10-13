package com.FinalProject.finalProject.beans;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.FinalProject.finalProject.Exception.EntityNotFound;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler({ EntityNotFound.class })
	public ResponseEntity<Object> handleEntityNotFound(EntityNotFound entityNotFound) {

		return GlobalResponseHandler.createResponse(entityNotFound.getMessage(), HttpStatus.NO_CONTENT);

	}

}
