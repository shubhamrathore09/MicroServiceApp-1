package com.masai.userServiceInMicro.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobleException {

    @ExceptionHandler(UserrNotFound.class)
    public ResponseEntity<MyError> UserrNotFoundHandler(UserrNotFound ex, WebRequest re){
        return  new ResponseEntity<MyError>(new MyError(ex.getMessage(),re.getDescription(false), LocalDateTime.now()), HttpStatus.NOT_FOUND);
    }
}
