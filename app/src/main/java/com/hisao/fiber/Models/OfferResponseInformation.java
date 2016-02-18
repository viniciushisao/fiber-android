package com.hisao.fiber.Models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by vinicius on 2/17/2016.
 */
public class OfferResponseInformation {
//    - app_name
//    - appid
//    - virtual_currency
//    - country
//    - language
//    - support_url

    private String app_name;
    private String appid;
    private String virtual_currency;
    private String country;
    private String language;
    private String support_url;

    public String getApp_name() {
        return app_name;
    }

    public void setApp_name(String app_name) {
        this.app_name = app_name;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getVirtual_currency() {
        return virtual_currency;
    }

    public void setVirtual_currency(String virtual_currency) {
        this.virtual_currency = virtual_currency;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getSupport_url() {
        return support_url;
    }

    public void setSupport_url(String support_url) {
        this.support_url = support_url;
    }
}
