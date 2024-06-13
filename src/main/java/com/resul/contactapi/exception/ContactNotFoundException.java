package com.resul.contactapi.exception;

public class ContactNotFoundException extends RuntimeException {
    public ContactNotFoundException(String s) {
        super(s);
    }
}
