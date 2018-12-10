package com.sunny.permission.exception;

import java.io.Serializable;

public class BaseException extends RuntimeException implements Serializable {

    private int code;


    public BaseException(){

    }

    public BaseException(int code , String message){
        super(message);
        this.code= code;
    }

    public BaseException(String  message){
        super(message);
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
