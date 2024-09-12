package ru.netology.coursework_restcardtransfer.exception;

public class ErrorInputData extends  RuntimeException{
    public ErrorInputData(String msg) {
        super(msg);
    }
}