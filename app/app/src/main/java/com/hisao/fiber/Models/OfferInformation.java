package com.hisao.fiber.Models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by vinicius on 2/17/2016.
 */
public class OfferInformation {
//    - app_name
//    - appid
//    - virtual_currency
//    - country
//    - language
//    - support_url

    @SerializedName("app_name")
    private String mAppName;
    @SerializedName("appid")
    private String mAppId;
    @SerializedName("virtual_currency")
    private String mVirtualCurrency;
    @SerializedName("country")
    private String mCountry;
    @SerializedName("language")
    private String mLanguage;
    @SerializedName("support_url")
    private String mSupportUrl;
}
