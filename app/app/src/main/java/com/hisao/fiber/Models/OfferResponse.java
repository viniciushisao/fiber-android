package com.hisao.fiber.Models;

import java.io.Serializable;
import java.util.List;

public class OfferResponse implements Serializable {

//    - response (only present in XML format)
//    - code
//    - message
//    - count
//    - pages
//    - information (class)
//    - offers[] (class)

    private String code;
    private String message;
    private String count;
    private String pages;
    private OfferResponseInformation information;
    private List<OfferResponseOffers> offers;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public OfferResponseInformation getInformation() {
        return information;
    }

    public void setInformation(OfferResponseInformation information) {
        this.information = information;
    }

    public List<OfferResponseOffers> getOffers() {
        return offers;
    }

    public void setOffers(List<OfferResponseOffers> offers) {
        this.offers = offers;
    }
}