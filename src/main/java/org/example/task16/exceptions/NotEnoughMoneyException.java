package org.example.task16.exceptions;

public class NotEnoughMoneyException extends RuntimeException{
    String errorCode;

    public NotEnoughMoneyException (String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}
