package com.alfarosoft.hotelbooking.exception;

public class CustomerException extends RuntimeException{
    private String message;
    private Integer status;

    public CustomerException(String message, Integer status) {
        super();
        this.message = message;
        this.status = status;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}
