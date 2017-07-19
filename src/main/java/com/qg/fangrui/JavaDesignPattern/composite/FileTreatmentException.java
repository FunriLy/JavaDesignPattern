package com.qg.fangrui.JavaDesignPattern.composite;

/**
 * Created by FunriLy on 2017/7/17.
 * From small beginnings comes great things.
 */
public class FileTreatmentException extends RuntimeException {

    public FileTreatmentException(){
        super();
    }

    public FileTreatmentException(String message){
        super(message);
    }

    public FileTreatmentException(String message, Throwable cause){
        super(message, cause);
    }
}
