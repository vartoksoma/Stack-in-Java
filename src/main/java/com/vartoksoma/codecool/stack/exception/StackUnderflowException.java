package com.vartoksoma.codecool.stack.exception;

public class StackUnderflowException extends Exception{
    public StackUnderflowException() {
    }

    public StackUnderflowException(String message) {
        super(message);
    }
}
