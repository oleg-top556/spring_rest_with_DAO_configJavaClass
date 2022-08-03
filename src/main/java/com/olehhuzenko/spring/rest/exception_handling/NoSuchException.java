package com.olehhuzenko.spring.rest.exception_handling;

public class NoSuchException extends RuntimeException {


    public NoSuchException(String message) {
        super(message);
    }
}
