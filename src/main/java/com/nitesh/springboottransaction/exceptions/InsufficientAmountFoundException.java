package com.nitesh.springboottransaction.exceptions;

public class InsufficientAmountFoundException extends RuntimeException {

    public InsufficientAmountFoundException(String msg) {
        super(msg);
    }
}
