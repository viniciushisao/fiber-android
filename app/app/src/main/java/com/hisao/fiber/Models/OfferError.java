package com.hisao.fiber.Models;

/**
 * Created by viniciushisao on 17/02/2016.
 */
public class OfferError {

    private String code;
    private String message;

    @Override
    public String toString() {
        return "OfferError{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
