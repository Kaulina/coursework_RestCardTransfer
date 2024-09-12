package ru.netology.coursework_restcardtransfer.repository;

import ru.netology.coursework_restcardtransfer.model.TransferModel;

public interface TransferRepositoryInterface {
    int getOperationId();
    void addTransfer(String id, TransferModel transferRequest);
    void addCode(String id, String code);
    TransferModel removeTransfer(String id);

    String removeCode(String id);
}