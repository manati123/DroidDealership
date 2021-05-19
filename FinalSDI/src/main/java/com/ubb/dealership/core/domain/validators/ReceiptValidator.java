package com.ubb.dealership.core.domain.validators;

import com.ubb.dealership.core.domain.Receipt;
import com.ubb.dealership.core.exceptions.ValidatorException;

public class ReceiptValidator implements Validator<Receipt> {
    @Override
    public void validate(Receipt entity) throws ValidatorException {
        var msgBuilder = new StringBuilder();



        if (entity.getPurchaseID() == 0) {
            msgBuilder.append("purchase id cannot be 0;");
        }

        if (entity.getTotalPrice() <= 0) {
            msgBuilder.append("total price cannot be smaller than 0 or 0;");
        }

        if (msgBuilder.isEmpty()) {
            return;
        }
        throw new ValidatorException(msgBuilder.toString());
    }
}
