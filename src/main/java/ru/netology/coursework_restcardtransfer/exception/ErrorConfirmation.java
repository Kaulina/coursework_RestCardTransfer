package ru.netology.coursework_restcardtransfer.exception;

public class ErrorConfirmation extends  RuntimeException{
    public ErrorConfirmation(String msg) {
        super(msg);
    }
}