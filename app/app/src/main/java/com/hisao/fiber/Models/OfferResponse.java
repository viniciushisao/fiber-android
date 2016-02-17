package com.hisao.fiber.Models;

import com.google.gson.annotations.SerializedName;

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

    @SerializedName("code")
    private String mCode;

    @SerializedName("message")
    private String mMessage;

    @SerializedName("count")
    private int mCount;

    @SerializedName("pages")
    private int mPages;

    @SerializedName("information")
    private OfferInformation offerInformation;

    @SerializedName("offers")
    private List<ResponseOffer> responseOffers;

}