package com.sample.rest.exception;

import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.sample.rest.schema.UpdateResponse;
import com.sample.rest.util.Constants;

@RestControllerAdvice
public class GeneralExceptionHandler extends ResponseEntityExceptionHandler {
	
	Logger LOGGER = LoggerFactory.getLogger(GeneralExceptionHandler.class);
	
	@ExceptionHandler(GeneralException.class)
	ResponseEntity<UpdateResponse> handleException(GeneralException exception) {
		LOGGER.error(exception.getErrorMessage(), exception.getCause());
		UpdateResponse errorResponse = new UpdateResponse();
		errorResponse.setStatus(Constants.RESPONSE_FAILURE);
		com.sample.rest.schema.Error error = new com.sample.rest.schema.Error();
		error.setCode(exception.getErrorCode());
		error.setMessage(exception.getErrorMessage());
		errorResponse.getErrors().add(error);
		return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(Exception.class)
	ResponseEntity<UpdateResponse> handleException(Exception exception) {
		LOGGER.error(exception.getMessage(), exception.getCause());
		UpdateResponse errorResponse = new UpdateResponse();
		errorResponse.setStatus(Constants.RESPONSE_FAILURE);
		com.sample.rest.schema.Error error = new com.sample.rest.schema.Error();
		error.setCode(Constants.INTERNAL_SERVER_ERROR);
		error.setMessage("Exception while processing "+exception.getMessage());
		errorResponse.getErrors().add(error);
		return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
