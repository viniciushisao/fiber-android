package com.hisao.fiber.Models;

/**
 * Created by viniciushisao
 */

public class OfferResponseOffersThumbnail {

    private String lowres;
    private String hires;

    @Override
    public String toString() {
        return "OfferResponseOffersThumbnail{" +
                "lowres='" + lowres + '\'' +
                ", hires='" + hires + '\'' +
                '}';
    }

    public String getLowres() {
        return lowres;
    }

    public void setLowres(String lowres) {
        this.lowres = lowres;
    }

    public String getHires() {
        return hires;
    }

    public void setHires(String hires) {
        this.hires = hires;
    }
}
