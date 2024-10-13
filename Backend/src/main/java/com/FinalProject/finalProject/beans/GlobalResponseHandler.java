package com.FinalProject.finalProject.beans;

import java.util.HashMap;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class GlobalResponseHandler {

	public static ResponseEntity<Object> createResponse(String message, Object payload, HttpStatus httpstatus) {

		HashMap<String, Object> response = new HashMap<>();
		response.put("message", message);
		response.put("data", payload);

		return new ResponseEntity<Object>(response, httpstatus);
	}

	public static ResponseEntity<Object> createResponse(String message, HttpStatus httpStatus) {

		HashMap<String, Object> response = new HashMap();
		response.put("mesaage", message);

		return new ResponseEntity<Object>(response, httpStatus);

	}

}
