package com.hisao.fiber.Models;

/**
 * Created by viniciushisao
 */

public class OfferResponseOffersTimeToPayout {

    private String amount;
    private String readable;

    @Override
    public String toString() {
        return "OfferResponseOffersTimeToPayout{" +
                "amount='" + amount + '\'' +
                ", readable='" + readable + '\'' +
                '}';
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getReadable() {
        return readable;
    }

    public void setReadable(String readable) {
        this.readable = readable;
    }
}
