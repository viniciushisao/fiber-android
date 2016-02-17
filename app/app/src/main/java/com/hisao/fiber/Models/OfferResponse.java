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
    private OfferInformation information;
    private List<ResponseOffer> offers;

}