package com.hisao.fiber.Models;

/**
 * Created by viniciushisao
 */

public class OfferResponseOffersOfferTypes {

    private String offer_type_id;
    private String readable;

    @Override
    public String toString() {
        return "OfferResponseOffersOfferTypes{" +
                "offer_type_id='" + offer_type_id + '\'' +
                ", readable='" + readable + '\'' +
                '}';
    }

    public String getOffer_type_id() {
        return offer_type_id;
    }

    public void setOffer_type_id(String offer_type_id) {
        this.offer_type_id = offer_type_id;
    }

    public String getReadable() {
        return readable;
    }

    public void setReadable(String readable) {
        this.readable = readable;
    }
}
