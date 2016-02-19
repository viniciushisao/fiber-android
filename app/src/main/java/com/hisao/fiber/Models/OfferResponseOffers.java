package com.hisao.fiber.Models;

/**
 * Created by viniciushisao
 */

import java.util.List;

public class OfferResponseOffers {

    private String link;
    private String title;
    private String offer_id;
    private String teaser;
    private String required_actions;
    private OfferResponseOffersThumbnail thumbnail;
    private List<OfferResponseOffersOfferTypes> offer_types;
    private String payout;
    private OfferResponseOffersTimeToPayout time_to_payout;

    @Override
    public String toString() {
        return "OfferResponseOffers{" +
                "link='" + link + '\'' +
                ", title='" + title + '\'' +
                ", offer_id='" + offer_id + '\'' +
                ", teaser='" + teaser + '\'' +
                ", required_actions='" + required_actions + '\'' +
                ", thumbnail=" + ((thumbnail != null) ? thumbnail.toString() : null) +
                ", offer_types=" + ((offer_types != null) ? offer_types.toString() : null) +
                ", payout='" + payout + '\'' +
                ", time_to_payout=" + ((time_to_payout != null) ? time_to_payout.toString() : null) +
                '}';
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOffer_id() {
        return offer_id;
    }

    public void setOffer_id(String offer_id) {
        this.offer_id = offer_id;
    }

    public String getTeaser() {
        return teaser;
    }

    public void setTeaser(String teaser) {
        this.teaser = teaser;
    }

    public String getRequired_actions() {
        return required_actions;
    }

    public void setRequired_actions(String required_actions) {
        this.required_actions = required_actions;
    }

    public OfferResponseOffersThumbnail getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(OfferResponseOffersThumbnail thumbnail) {
        this.thumbnail = thumbnail;
    }

    public List<OfferResponseOffersOfferTypes> getOffer_types() {
        return offer_types;
    }

    public void setOffer_types(List<OfferResponseOffersOfferTypes> offer_types) {
        this.offer_types = offer_types;
    }

    public String getPayout() {
        return payout;
    }

    public void setPayout(String payout) {
        this.payout = payout;
    }

    public OfferResponseOffersTimeToPayout getTime_to_payout() {
        return time_to_payout;
    }

    public void setTime_to_payout(OfferResponseOffersTimeToPayout time_to_payout) {
        this.time_to_payout = time_to_payout;
    }
}