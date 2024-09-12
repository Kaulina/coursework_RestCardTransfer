package ru.netology.coursework_restcardtransfer.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.coursework_restcardtransfer.model.ConfirmOperationModel;
import ru.netology.coursework_restcardtransfer.model.TransferModel;
import ru.netology.coursework_restcardtransfer.model.TransferResponse;
import ru.netology.coursework_restcardtransfer.service.TransferService;

@CrossOrigin("https://serp-ya.github.io/")
@AllArgsConstructor
@RestController
public class TransferController {
    private final TransferService service;

    @PostMapping("/transfer")
    public TransferResponse postTransfer(@RequestBody TransferModel transferModel) {
        return service.postTransfer(transferModel);
    }

    @PostMapping("/confirmOperation")
    public TransferResponse postConfirmOperation(@RequestBody ConfirmOperationModel confirmOperation) {
        return service.postConfirmOperation(confirmOperation);
    }
}