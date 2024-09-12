package ru.netology.coursework_restcardtransfer.logger;

import ru.netology.coursework_restcardtransfer.model.ConfirmOperationModel;
import ru.netology.coursework_restcardtransfer.model.TransferModel;

public interface LoggerInterface {
    String logTransferModel(TransferModel model, Integer amount, double commissionOfTheBank, String stringUuid);
    String logConfirmOperation(ConfirmOperationModel confirmOperationModel, String stringUuid);
    String logError(String stringUuid);
}
