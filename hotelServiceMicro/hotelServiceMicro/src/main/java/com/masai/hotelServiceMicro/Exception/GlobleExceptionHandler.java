package com.masai.hotelServiceMicro.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobleExceptionHandler {

    @ExceptionHandler(HotelException.class)
    public ResponseEntity<MyError> HotelExceptionHandler(HotelException ex, WebRequest re){
        return new ResponseEntity<>(new MyError(ex.getMessage(),re.getDescription(false), LocalDateTime.now()), HttpStatus.BAD_REQUEST);
    }
}
