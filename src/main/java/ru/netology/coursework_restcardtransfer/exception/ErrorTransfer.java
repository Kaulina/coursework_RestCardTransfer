package ru.netology.coursework_restcardtransfer.exception;

public class ErrorTransfer extends  RuntimeException{
    public ErrorTransfer(String msg) {
        super(msg);
    }
}